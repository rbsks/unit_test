package com.example.demo.user.event;

import com.example.demo.user.domain.SignUpHistory;
import com.example.demo.user.adapter.out.persistence.SignUpHistoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Slf4j
@Component
@RequiredArgsConstructor
public class SaveUserEventListener {

    private final SignUpHistoryRepository signUpHistoryRepository;

    /*
     @TransactionalEventListener의 동작 원리는 AbstractPlatformTransactionManager의 processCommit 메서드에서 자세히 확인할 수 있다.
     */
    @Async
    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void transactionalEventListenerAfterCommit(SaveUserEvent saveUserEvent) {
        log.info("[TransactionalEventListener After Commit]");
        log.info("[save user]: {}", saveUserEvent);
        signUpHistoryRepository.save(SignUpHistory.create(saveUserEvent.id()));
    }
}
