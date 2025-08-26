package br.com.victor.ordering.domain.valueobject;

import br.com.victor.ordering.domain.validator.FieldValidations;

public record ProductName(String value) {

    public ProductName {
        FieldValidations.requiresNonBlank(value);
    }

    @Override
    public String toString() {
        return value;
    }

}