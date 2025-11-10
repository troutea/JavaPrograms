package org.example;

public class Main {


    static void  decToBinary(int n) {

        int binaryNum[] = new int[1000];
        int i = 0;

        while (n > 0) {
            //storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }

        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
        //driver code
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int n = 17;
        System.out.println("Decimal - " + n);
        System.out.println("Binary = ");
        decToBinary(n);



    }
}
