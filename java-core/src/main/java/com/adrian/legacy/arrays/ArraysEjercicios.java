package com.adrian.legacy.arrays;

import java.util.Arrays;

public class ArraysEjercicios {

    public static void main(String[] args) {

        int [] numbers = {8, 3, 15, 6, 2, 11};
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            else if (num < min) {
                min = num;
            }
        }
        System.out.println(min +" "+max);
    }
}
