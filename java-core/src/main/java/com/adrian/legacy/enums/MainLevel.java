package com.adrian.legacy.enums;

public class MainLevel {

    public static void main(String[] args) {

        Level level = Level.HIGH;

//        if (level == Level.HIGH) {
//            System.out.println("High");
//        }
//        else if (level == Level.MEDIUM) {
//            System.out.println("Medium");
//        }
//        else if (level == Level.LOW) {
//            System.out.println("Low");
//        }
//        else {
//            System.out.println("Unknown");
//        }

//        switch (level) {
//            case HIGH : {
//                System.out.println(Level.HIGH.toString());
//                break;
//            }
//            case MEDIUM : {
//                System.out.println("Medium");
//                break;
//            }
//            case LOW : {
//                System.out.println("Low");
//                break;
//            }
//            default : {
//                System.out.println("Unknown");
//                break;
//            }
//        }


        Level [] values = Level.values();
        for (Level value : values) {
            System.out.println(value);
        }
    }
}
