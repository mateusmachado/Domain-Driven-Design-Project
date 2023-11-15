package com.catalog.admin.application;

import com.catalog.admin.domain.Category;

public class UseCase {
    public Category execute() {
        return new Category();
    }
}