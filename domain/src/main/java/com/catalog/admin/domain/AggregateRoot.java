package com.catalog.admin.domain;

import com.catalog.admin.domain.category.CategoryValidator;
import com.catalog.admin.domain.validation.ValidationHandler;

public class AggregateRoot<ID extends Identifier> extends Entity<ID> {
    protected AggregateRoot(final ID id) {
        super(id);
    }

    @Override
    public void validate(final ValidationHandler handler) {
        new CategoryValidator(this, handler).validate();
    }
}
