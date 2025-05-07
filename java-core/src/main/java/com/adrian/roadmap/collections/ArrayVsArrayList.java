package com.adrian.roadmap.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Array list solo puede invocar a la clase del tipo de dato
 * Array puede invocar el dato primitivo y la clase del tipo de dato
 */
public class ArrayVsArrayList {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.remove(1);

        for (Integer integer : list){
            System.out.println(integer);
        }
        System.out.println(list.contains(5));
    }
}
