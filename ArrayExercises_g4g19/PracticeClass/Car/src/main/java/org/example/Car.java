package org.example;

//Input: array = [ 1, 2, 1, 3, 5, 1 ] , key = 1
//Output: [2, 3, 5]
//
//Explanation: all the occurrences of element 1 is removed from the array So, array becomes from
//
//    [ 1, 2, 1, 3, 5, 1 ]  to
//Final result: [2, 3, 5]

public class Car {

    public static  int sumArray(int arr[]) {
        System.out.println("The array values are " + arr);
        int key = 1;
        int[] newArray = {};

        for (int i = 0; i < arr.length; i++ ) {
            System.out.println(arr[i]);
            if (key != arr[i]) {
                    continue;
            } else {
                newArray[i] = arr[i];
            }

        }
        System.out.println("The total is from the sum function:" );
        return 0;
    }

    public void UsingCar()
    {
        System.out.println("Accessing the car class");
    }


}
