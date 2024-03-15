package com.example.demo.user.adapter.out.persistence;

import com.example.demo.user.domain.User;

public interface UserRepository {

    User save(User user);
    User findById(Long userId);
    void modifyUser(User user);
}
