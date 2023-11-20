package com.catalog.admin.domain.category;

import com.catalog.admin.domain.validation.ValidationHandler;
import com.catalog.admin.domain.validation.Validator;

public class CategoryValidator extends Validator {

    private final Category category;

    public CategoryValidator(final Category category, final ValidationHandler aHandler) {
        super(aHandler);
        this.category = category;
    }

    @Override
    public void validate() {

    }
}
