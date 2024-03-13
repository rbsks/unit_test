package com.example.demo.user.application.domain;


import com.example.demo.user.infrasturcture.SignUpHistoryEntity;

public record SignUpHistory(
        Long id,
        Long userId) {

    public static SignUpHistory createSignupHistory(Long userId) {
        return new SignUpHistory(null, userId);
    }
    public static SignUpHistory of(SignUpHistoryEntity signUpHistoryEntity) {
        return new SignUpHistory(signUpHistoryEntity.getId(), signUpHistoryEntity.getUserId());
    }

    public static SignUpHistoryEntity toEntity(SignUpHistory signupHistory) {
        return new SignUpHistoryEntity(signupHistory.userId);
    }
}
