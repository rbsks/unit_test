package com.example.demo.user.adapter.out.persistence;

import com.example.demo.user.domain.SignUpHistory;

public interface SignUpHistoryRepository {

    SignUpHistory save(SignUpHistory signupHistory);
}
