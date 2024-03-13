package com.example.demo.user.controller;

import com.example.demo.user.application.service.SaveUserProcess;
import com.example.demo.user.controller.request.SaveUserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final SaveUserProcess saveUserProcess;

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void saveUser(@RequestBody SaveUserRequest saveUserRequest) {
        saveUserProcess.saveUser(saveUserRequest);
    }
}