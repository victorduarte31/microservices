package br.com.victor.ordering.domain.valueobject.id;

import br.com.victor.ordering.domain.utility.IdGenerator;

import java.util.Objects;
import java.util.UUID;

public record ProductId(UUID value) {

    public ProductId {
        Objects.requireNonNull(value);
    }

    public ProductId() {
        this(IdGenerator.generate());
    }

    @Override
    public String toString() {
        return value.toString();
    }
}