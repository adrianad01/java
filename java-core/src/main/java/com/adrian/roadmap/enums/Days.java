package com.adrian.roadmap.enums;

import lombok.Getter;

@Getter
public enum Days {

    LUNES (1),
    MARTES (2),
    MIERCOLES(3),
    JUEVES(4),
    VIERNES(5),
    SABADO(6),
    DOMINGO(7);

    private final Integer value;

    Days(Integer value) {
        this.value = value;
    }

    public static Days getDaysNumber(Integer value) {
        for (Days day : Days.values()) {
            if (day.getValue().equals(value)) {
                return day;
            }
        }
        throw new IllegalArgumentException("Unknown day " + value);
    }
}
