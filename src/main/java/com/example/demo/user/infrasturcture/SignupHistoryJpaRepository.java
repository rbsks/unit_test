package com.example.demo.user.infrasturcture;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SignupHistoryJpaRepository extends JpaRepository<SignUpHistoryEntity, Long> {
}
