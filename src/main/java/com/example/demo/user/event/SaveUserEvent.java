package com.example.demo.user.event;

public record SaveUserEvent(
        Long id,
        String email,
        String name) {

    public static SaveUserEvent createSaveUserEvent(Long id, String email, String name) {
        return new SaveUserEvent(id, email, name);
    }
}
