package com.catalog.admin.application;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class UseCaseTest {

    @Test
    public void testCreateUseCase() {
        new UseCase();
        assertNotNull(new UseCase().execute());
    }
}