package com.example.demo.user.application.service;

import com.example.demo.user.event.SaveUserEvent;
import com.example.demo.user.controller.request.SaveUserRequest;
import com.example.demo.user.application.domain.User;
import com.example.demo.user.application.domain.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Component
@RequiredArgsConstructor
public class SaveUserProcess {

    private final UserRepository userRepository;
    private final ApplicationEventPublisher applicationEventPublisher;

    @Transactional
    public void saveUser(SaveUserRequest saveUserRequest) {
        User user = userRepository.save(User.createUser(saveUserRequest.email(), saveUserRequest.name()));
        applicationEventPublisher.publishEvent(SaveUserEvent.createSaveUserEvent(user.id(), user.email(), user.name()));
    }
}
