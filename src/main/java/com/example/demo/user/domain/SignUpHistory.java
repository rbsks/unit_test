package com.example.demo.user.domain;


import com.example.demo.user.adapter.out.persistence.SignUpHistoryEntity;

public record SignUpHistory(
        Long id,
        Long userId) {

    public static SignUpHistory create(Long userId) {
        return new SignUpHistory(null, userId);
    }
    public static SignUpHistory fromEntity(SignUpHistoryEntity signUpHistoryEntity) {
        return new SignUpHistory(signUpHistoryEntity.getId(), signUpHistoryEntity.getUserId());
    }

    public static SignUpHistoryEntity toEntity(SignUpHistory signupHistory) {
        return new SignUpHistoryEntity(signupHistory.userId);
    }
}
