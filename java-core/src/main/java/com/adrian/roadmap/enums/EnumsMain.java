package com.adrian.roadmap.enums;

import org.w3c.dom.ls.LSOutput;

public class EnumsMain {
    public static void main(String[] args) {

        Days day = Days.valueOf("LUNES");

        switch(day){
            case LUNES -> System.out.println("Hoy es Lunes");
            case MARTES -> System.out.println("Martes");
            case MIERCOLES -> System.out.println("Miercoles");
            case JUEVES -> System.out.println("Jueves");
            case VIERNES -> System.out.println("Viernes");
            case SABADO -> System.out.println("Sabado");
            case DOMINGO -> System.out.println("Domingo");
            default -> System.out.println("Unknown");
        }
    }
}
