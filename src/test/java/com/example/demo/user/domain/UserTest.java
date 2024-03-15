package com.example.demo.user.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {

    @Test
    @DisplayName("유저 이름 변경 테스트")
    public void test() throws Exception {
        //given
        final String modifyUserName = "coby";
        User user = new User(1L, "rbsks147@test.com", "rbsks");

        //when
        User modifyUser = user.modifyUserName(modifyUserName);

        //then
        assertThat(modifyUser.name()).isEqualTo(modifyUserName);
    }
}
