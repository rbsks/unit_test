package com.example.demo.user.application.domain;


import com.example.demo.user.infrasturcture.UserEntity;

public record User(
        Long id,
        String email,
        String name) {

    public static User createUser(String email, String name) {
        return new User(null, email, name);
    }

    public static User of(UserEntity userEntity) {
        return new User(userEntity.getId(), userEntity.getEmail(), userEntity.getName());
    }

    public static UserEntity toEntity(User user) {
        return new UserEntity(user.email, user.name);
    }
}
