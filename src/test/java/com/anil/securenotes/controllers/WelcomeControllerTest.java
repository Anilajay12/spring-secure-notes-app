package com.anil.securenotes.controllers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class WelcomeControllerTest {

    @Autowired
    private WelcomeController welcomeController;

    @Test
    void testAdminMessage() {
        String admin = welcomeController.admin();
        Assertions.assertThat(admin).isEqualTo("admin");
    }

    @Test
    void testUserMessage() {
        String user = welcomeController.user();
        Assertions.assertThat(user).isEqualTo("user");
    }
}