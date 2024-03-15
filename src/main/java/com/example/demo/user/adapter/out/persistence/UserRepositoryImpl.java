package com.example.demo.user.adapter.out.persistence;

import com.example.demo.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final UserJpaRepository userJpaRepository;

    @Override
    public User save(User user) {
        return User.fromEntity(
                userJpaRepository.save(
                        User.toEntity(user)
                )
        );
    }

    @Override
    public User findById(Long userId) {
        return User.fromEntity(
                userJpaRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("not found user"))
        );
    }

    @Override
    public void modifyUser(User user) {
        userJpaRepository.save(User.toEntity(user));
    }
}
