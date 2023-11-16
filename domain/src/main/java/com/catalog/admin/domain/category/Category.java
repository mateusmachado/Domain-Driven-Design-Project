package com.catalog.admin.domain.category;

import lombok.Data;

import java.time.Instant;
import java.util.UUID;

@Data
public class Category {
    private String id;
    private String name;
    private String description;
    private Boolean isActive;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant deletedAt;

    private Category(String id,
                     final String name,
                     final String description,
                     final Boolean isActive,
                     final Instant createdAt,
                     final Instant updatedAt,
                     final Instant deletedAt
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.isActive = isActive;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public static Category newCategory(final String name,
                                       final String description,
                                       final Boolean isActive) {

        final var id = UUID.randomUUID().toString();
        final var now = Instant.now();
        return new Category(id, name, description, isActive, now, now, null);
    }


}