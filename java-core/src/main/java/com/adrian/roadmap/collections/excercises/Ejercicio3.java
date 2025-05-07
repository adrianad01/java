package com.adrian.roadmap.collections.excercises;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio3 {
    public static void main(String[] args) {

        Map<String, Integer> phoneAddresses = new HashMap<>();
        phoneAddresses.put("Juan", 12312312);
        phoneAddresses.put("Miguel", 123453223);
        phoneAddresses.put("Antonio", 5677423);
        phoneAddresses.put("Adrian", 2131231);
        phoneAddresses.put("Angel", 9809131);
        phoneAddresses.put("Andres", 6137131);

        for (Map.Entry<String, Integer> entry : phoneAddresses.entrySet()) {
            System.out.println("El teléfono de " +entry.getKey() + " es: " + entry.getValue());
        }
        System.out.println("El actual telefono de Adrian es: " + phoneAddresses.get("Adrian"));
        phoneAddresses.put("Adrian", 6137131);
        System.out.println("El nuevo teléfono de Adrian es: " + phoneAddresses.get("Adrian"));
    }
}
