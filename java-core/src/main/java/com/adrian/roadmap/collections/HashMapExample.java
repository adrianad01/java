package com.adrian.roadmap.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        Map<String, String> phones = new HashMap<>();
        phones.put("Adrian", "12344");
        phones.put("Davis", "12345");
        phones.put("John", "12346");
        phones.put("Mary", "12347");
        phones.put("Lisa", "12348");
        phones.put("Michael", "12349");

        System.out.println(phones);
        System.out.println(phones.get("Adrian"));

        if(phones.containsKey("Davis")) {
            System.out.println(phones.get("Davis"));
        }

        for(Map.Entry<String, String> entry : phones.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
