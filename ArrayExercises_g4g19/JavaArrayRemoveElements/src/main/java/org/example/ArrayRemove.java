package org.example;

import java.util.Arrays;

public class ArrayRemove {
    //private


    static void readArray(int a[]) {
        System.out.println("Calling the readArray function");
        int ind = 0;
        int[] b = new int[];
        for (int i = 0; i < a.length; i++)
        {
           // System.out.println(a[i]);
            if(a[i] != 1) {
                System.out.println(a[i]);
                //a[ind++] = a[i];
               // b[i] = a[i];
                System.out.println(b[i]);

            }

            //System.out.println(b[i]);
        }
       // return Arrays.copyOf(a,ind);


    }




    //public


    //protected

}
