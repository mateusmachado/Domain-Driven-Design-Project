package com.catalog.admin.domain.validation;

public abstract class Validator {

    public final ValidationHandler handler;

    protected Validator(final ValidationHandler aHandler) {
        this.handler = aHandler;
    }

    public abstract void validate();

    protected ValidationHandler validationHandler() {
        return this.handler
    }
}
