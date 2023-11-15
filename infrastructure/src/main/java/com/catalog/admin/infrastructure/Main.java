package com.catalog.admin.infrastructure;

import com.catalog.admin.application.UseCase;

public class Main {
    public static void main(String[] args) {
        System.out.println(new UseCase().execute());
    }

}