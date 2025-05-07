package com.adrian.legacy.optionals;

import java.util.Optional;

public class OptionalLearning {
    public static void main(String[] args) {

        Optional<String> name = Optional.of("Adrian");
        Optional<String> empty = Optional.empty();
        Optional<String> posibleNull = Optional.ofNullable(obtenerNombre());
        Optional<String>  upperName = name.map(String::toUpperCase);

        System.out.println(name);
        System.out.println(empty);
        System.out.println(upperName);

    }

    private static String obtenerNombre() {
        return null;
    }
}
