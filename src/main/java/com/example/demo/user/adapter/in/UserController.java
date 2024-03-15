package com.example.demo.user.adapter.in;

import com.example.demo.user.adapter.in.request.ModifyUserRequest;
import com.example.demo.user.application.usecase.ModifyUserUseCase;
import com.example.demo.user.application.usecase.SaveUserUseCase;
import com.example.demo.user.adapter.in.request.SaveUserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final SaveUserUseCase saveUserUseCase;
    private final ModifyUserUseCase modifyUserUseCase;

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void saveUser(@RequestBody final SaveUserRequest saveUserRequest) {
        saveUserUseCase.saveUser(saveUserRequest);
    }

    @PatchMapping("/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void modifyUser(
            @PathVariable final Long userId,
            @RequestBody final ModifyUserRequest modifyUserRequest) {
        modifyUserUseCase.modifyUser(userId, modifyUserRequest);
    }
}
