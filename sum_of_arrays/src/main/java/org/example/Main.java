package org.example;



public class Main {


   static int sumTheArray() {
        int sum = 0;
       // int i = 0;
        int arr[] = {2,4,6,7,9};
        for (int i = 0; i < arr.length; i++) {
           // System.out.println(arr[i]);

            sum = sum + arr[i];
        }
       System.out.println("The sum is " + sum);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        sumTheArray();


    }
}
