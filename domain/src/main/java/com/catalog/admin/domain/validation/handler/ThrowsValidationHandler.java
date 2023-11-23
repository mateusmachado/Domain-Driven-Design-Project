package com.catalog.admin.domain.validation.handler;

import com.catalog.admin.domain.exceptions.DomainException;
import com.catalog.admin.domain.validation.Error;
import com.catalog.admin.domain.validation.ValidationHandler;

import java.util.List;

public class ThrowsValidationHandler implements ValidationHandler {
    @Override
    public ValidationHandler append(final Error anError) {
        throw DomainException.with(List.of());
    }

    @Override
    public ValidationHandler append(final ValidationHandler anHandler) {
        throw DomainException.with(anHandler.getErrors());
    }

    @Override
    public ValidationHandler validate(final Validation aValidation) {
        try {
            aValidation.validate();
        } catch (final Exception ex) {
            throw DomainException.with(List.of());
        }

        return this;
    }

    @Override
    public List<java.lang.Error> getErrors() {
        return List.of();
    }
}
