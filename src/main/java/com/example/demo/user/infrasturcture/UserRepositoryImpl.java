package com.example.demo.user.infrasturcture;

import com.example.demo.user.application.domain.User;
import com.example.demo.user.application.domain.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final UserJpaRepository userJpaRepository;

    @Override
    public User save(User user) {
        return User.of(
                userJpaRepository.save(
                        User.toEntity(user)
                )
        );
    }
}
