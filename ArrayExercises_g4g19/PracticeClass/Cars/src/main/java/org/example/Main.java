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



        System.out.println("The tyre type is  " + tesla.getTyreType());

    }
}
