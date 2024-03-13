package com.example.demo.user.event;

import com.example.demo.user.application.domain.SignUpHistory;
import com.example.demo.user.application.domain.SignUpHistoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Slf4j
@Component
@RequiredArgsConstructor
public class SaveUserEventListener {

    private final SignUpHistoryRepository signUpHistoryRepository;

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void transactionalEventListenerAfterCommit(SaveUserEvent saveUserEvent) {
        log.info("[TransactionalEventListener After Commit]");
        log.info("[save user]: {}", saveUserEvent);
        signUpHistoryRepository.save(SignUpHistory.createSignupHistory(saveUserEvent.id()));
    }
}
