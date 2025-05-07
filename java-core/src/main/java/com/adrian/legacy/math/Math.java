package com.adrian.legacy.math;

import static java.lang.Math.*;

/**
 * @return the math package with own methods
 */
public class Math {

    public static void main(String[] args) {

    int abs = abs(-11);
    double round = ceil(1.32);
    double floor = floor(1.32);
    double floorDiv = floorDiv(-100,9);
    int min = min(100,43);
    int max = max(100,43);
    double roundNumber = round(73.2);
    double random = random();
    double random1 = random() * 1000;
    double expo = exp(1);
    double logarithm = log(1000);
    double logarithmTen = log10(1000);
    double pow = pow(2,10);
    double sqrt = sqrt(81);
    double PI = java.lang.Math.PI;

    System.out.println(abs);
    System.out.println(round);
    System.out.println(floor);
    System.out.println(floorDiv);
    System.out.println(min);
    System.out.println(max);
        System.out.println(roundNumber);
        System.out.println(random);
        System.out.println(random1);
        System.out.println(expo);
        System.out.println(logarithm);
        System.out.println(logarithmTen);
        System.out.println(pow);
        System.out.println(sqrt);
        System.out.println(PI);
    }
}
