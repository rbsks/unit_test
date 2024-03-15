package com.example.demo.user.application.usecase;

import com.example.demo.user.adapter.in.request.ModifyUserRequest;
import com.example.demo.user.adapter.out.persistence.UserRepository;
import com.example.demo.user.domain.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class ModifyUserUseCase {

    private final UserRepository userRepository;

    public void modifyUser(final Long userId, final ModifyUserRequest modifyUserRequest) {
        User user = userRepository.findById(userId);

        User modifyUser = user.modifyUserName(modifyUserRequest.name());

        userRepository.modifyUser(modifyUser);
    }
}
