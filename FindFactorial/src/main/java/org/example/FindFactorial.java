package org.example;

public class FindFactorial {

    public static int FindFactorial(int num) {

        int res = 1;

        for (int i = 2; i <= num; i++) {
            //System.out.println(i);
            res *= i;
            System.out.println(res);
        }
        return res;
    }

}
