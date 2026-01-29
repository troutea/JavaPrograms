package org.example;


 //import org.example.Tyre;

 public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Cars tesla = new Tesla();
        tesla.setAge(2);
        System.out.println(tesla.getAge());
        //overridden method
        tesla.setTyreType("rubber");


        Tyre tyre = new Tyre("dunlop", "champion");
        System.out.println("the tyre type is  " + tyre.summer);
        System.out.println("the tyre type is  " + tyre.winter);
        tyre.winter = "skoda";
        System.out.println("the tyre type is  " + tyre.winter);




    }
}
