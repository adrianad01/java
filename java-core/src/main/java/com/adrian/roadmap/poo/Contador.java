package com.adrian.roadmap.poo;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contador {

    private static int value = 0;

    public static int contar() {
        return value++;
    }
}
