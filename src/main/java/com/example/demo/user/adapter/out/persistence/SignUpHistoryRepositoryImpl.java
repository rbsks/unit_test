package com.example.demo.user.adapter.out.persistence;

import com.example.demo.user.domain.SignUpHistory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SignUpHistoryRepositoryImpl implements SignUpHistoryRepository {

    private final SignupHistoryJpaRepository signupHistoryJpaRepository;

    @Override
    public SignUpHistory save(SignUpHistory signupHistory) {
        return SignUpHistory.fromEntity(
                signupHistoryJpaRepository.save(
                        SignUpHistory.toEntity(signupHistory)
                )
        );
    }
}
