package com.test;

import java.util.Random;

public class HelloWorld {
    private final Random random;

    public HelloWorld() {
        this.random = new Random();
    }

    public void printThing(int number) {
        System.out.println("thing" + number);
    }

    private int addThing(int number) {
        return 10 + number;
    }

    public boolean randomtrueorfalse() {
        return random.nextBoolean();
    }


    public static void main(String... args) {
        HelloWorld HW = new HelloWorld();
        HW.printThing(32);
        int addednumber = HW.addThing(64);
        HW.printThing(addednumber);
        if (HW.randomtrueorfalse()) {
            System.out.println("this time I got true");
        } else {
            System.out.println("this time I got False");
        }

//        int number = Integer.MAX_VALUE;
//        long bigNumber = 0L;
//
//        float floaty = Float.MAX_VALUE;
//        double decimal = Double.MAX_VALUE;
//
//        System.out.println( "Integer max value: " + number);
//        System.out.println( "Long max value: " + bigNumber);
////        System.out.println(printStatement);
//        boolean spanky = true;
//        if(number < bigNumber){
//            System.out.println("64 bit is bigger than 32 bit");
//        } else {
//            System.out.println("Everything is broken");
//            System.out.println("Hello");
//        }
    }
}
