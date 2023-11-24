package com.catalog.admin.domain;

import com.catalog.admin.domain.validation.ValidationHandler;

import java.util.Objects;

public abstract class Entity<ID extends Identifier> {

    protected final ID id;

    protected Entity(ID id) {
        Objects.requireNonNull(id, "'id' should not be null");
        this.id = id;
    }

    public abstract void validate(ValidationHandler handler);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity<?> entity = (Entity<?>) o;
        return Objects.equals(id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
