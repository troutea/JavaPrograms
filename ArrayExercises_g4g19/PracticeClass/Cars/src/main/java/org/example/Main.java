package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Tesla tesla = new Tesla();
        tesla.getYear(3);
        tesla.brakeType = "good brakes";

        System.out.println(tesla.maxSpeed);
        System.out.println(tesla.brakeType);
        //tesla.getMaxSpeed(20);

        Ford ford = new Ford();
        ford.getYear(2);



    }
}
