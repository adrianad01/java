package com.adrian.legacy.lambda;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class LambdaExamples {

    public static void main(String[] args) {

        Consumer<String> consumer = saludo -> {
            System.out.println(saludo);
        };

        consumer.accept("Hello");

        BiConsumer<String, Integer> biConsumer = (name, age) ->
                System.out.println(name + " has " + age + " years old");

        biConsumer.accept("Adrian", 20);
    }
}
