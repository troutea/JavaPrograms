package org.example;


class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }


}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);


    }
}
