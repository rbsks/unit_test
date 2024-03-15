package com.example.demo.user.domain;


import com.example.demo.user.adapter.out.persistence.UserEntity;

public record User(
        Long id,
        String email,
        String name) {


    public User modifyUserName(String name) {
        return new User(this.id, this.email, name);
    }

    public static User create(String email, String name) {
        return new User(null, email, name);
    }

    public static User fromEntity(UserEntity userEntity) {
        return new User(userEntity.getId(), userEntity.getEmail(), userEntity.getName());
    }

    public static UserEntity toEntity(User user) {
        return new UserEntity(user.id, user.email, user.name);
    }
}
