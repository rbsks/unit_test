package com.example.demo.user.infrasturcture;

import com.example.demo.user.application.domain.SignUpHistory;
import com.example.demo.user.application.domain.SignUpHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SignUpHistoryRepositoryImpl implements SignUpHistoryRepository {

    private final SignupHistoryJpaRepository signupHistoryJpaRepository;

    @Override
    public SignUpHistory save(SignUpHistory signupHistory) {
        return SignUpHistory.of(
                signupHistoryJpaRepository.save(
                        SignUpHistory.toEntity(signupHistory)
                )
        );
    }
}
