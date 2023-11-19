package com.catalog.admin.domain.exceptions;

import java.util.List;

public class DomainException extends RuntimeException {



    private DomainException(final List<Error> anErrors) {

    }
}
