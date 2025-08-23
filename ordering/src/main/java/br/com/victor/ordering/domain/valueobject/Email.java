package br.com.victor.ordering.domain.valueobject;

import br.com.victor.ordering.domain.validator.FieldValidations;

public record Email(String value) {
    public Email {
        FieldValidations.requiresValidEmail(value);
    }

    @Override
    public String toString() {
        return value;
    }
}