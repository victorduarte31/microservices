package br.com.victor.ordering.domain.utility;

import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.impl.TimeBasedEpochRandomGenerator;

import java.util.UUID;

public class IdGenerator {

    private static final TimeBasedEpochRandomGenerator GENERATOR = Generators.timeBasedEpochRandomGenerator();

    private IdGenerator() {
    }

    public static UUID generate() {
        return GENERATOR.generate();
    }
}
