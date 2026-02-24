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


        
         tesla.setTyreType("michelin");

         tesla.setModel("Model 3");
         tesla.getModel();
         tesla.setColor("Black");
         System.out.println(tesla.getColor());
         System.out.println(tesla.getModel());

         // Using the super keyword here
         System.out.println(tesla.getTyreType());


//
//        //here is the specific tesla function detailed in the tesla class
//       // Tesla tesla_prop = new Tesla();
        //Might need to make this static see
        //https://gemini.google.com/app/fd3052dd10ca5378
//        ((Tesla)tesla).setColor("Black");
//         System.out.println(((Tesla)tesla).getColor());


        //Here I want to call specific functions from Tesla class for e.g setColor
       // Pattern Matching for instanceof to make this much safer and more readable:
        // In hindsight this casts, I should move this function to the base class Cars

//        if (tesla instanceof Tesla t) {
//            t.setColor("Black");
//            System.out.println(t.getColor());
//        }


    }
}
