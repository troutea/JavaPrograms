package org.example;


 //import org.example.Tyre;

 public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //this calls the constructor for Cars , You can set the initiil values if you wish

        Cars tesla = new Tesla();

        tesla.setAge(2);
        System.out.println(tesla.getAge());
        //overridden method

        //demonstrates Inheritance and polymorphism
         tesla.setTyreType("rubber");
         tesla.setModel("Model 3");
         tesla.getModel();
         //System.out.println(tesla.getModel());
//
//        //here is the specific tesla function detailed in the tesla class
//       // Tesla tesla_prop = new Tesla();
        //Might need to make this static see
        //https://gemini.google.com/app/fd3052dd10ca5378
        ((Tesla)tesla).setColor("Black");
         System.out.println(((Tesla)tesla).getColor());




        //Here I want to call specific functions from Tesla class for e.g setColor


//        Tyre tyre = new Tyre("dunlop", "champion");
//        System.out.println("the tyre type is  " + tyre.summer);
//        System.out.println("the tyre type is  " + tyre.winter);
//        tyre.winter = "skoda";
//        System.out.println("the tyre type is  " + tyre.winter);






    }
}
