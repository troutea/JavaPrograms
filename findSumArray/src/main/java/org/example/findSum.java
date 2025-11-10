package org.example;

public class findSum {
    static int findSum()
    {
        int arr[] = {1,2,3,4,5};
        int arrsum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrsum += arr[i];

        }
        System.out.println("The array sum is " + arrsum);

        return 0;
    }

}
