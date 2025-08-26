package br.com.victor.ordering.domain.valueobject.id;

import br.com.victor.ordering.domain.utility.IdGenerator;

import java.util.Objects;
import java.util.UUID;

public record CustomerId(UUID value) {

    public CustomerId {
        Objects.requireNonNull(value);
    }

    public CustomerId() {
        this(IdGenerator.generate());
    }

    @Override
    public String toString() {
        return value.toString();
    }
}