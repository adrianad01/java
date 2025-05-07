package com.adrian.roadmap.poo;

import static com.adrian.roadmap.constants.Constants.ROADMAP_VERSION;

public class FinalClass {
    public static void main(String[] args) {

        int number = 0;
        number = 2;

        final int numberTwo = 2;
        //numberTwo = 5; java: cannot assign a value to final variable numberTwo

        System.out.println(number);
        System.out.println(numberTwo);

        System.out.println(ROADMAP_VERSION);
    }
}
