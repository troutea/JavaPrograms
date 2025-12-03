package org.example;

public class arrayExercise17 {

    static int arr[] = {1,2,3,4,5,6};


    static void dsort() {

         int d = 2;
        for (int i = 0; i <= d; i++)
        {
            System.out.println(arr[i]);
             arr[arr.length - 2] = arr[i];

        }

        System.out.println("Print array after the move \n");
        for (int i = 0; i < arr.length; i++)
        {

            System.out.println(arr[i]);
        }



    }


}
