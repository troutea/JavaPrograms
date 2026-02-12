package org.example;

public class Tesla extends Cars {
    private String Color;
    private int maxSpeed = 100;
    private String TyreType;

    public Tesla() {
        System.out.println("Calling the constructor for Cars with no initial values set");
    }


   public void setColor(String Color) {
       this.Color = Color;
   }

    public String getColor() {
        return Color;
    }

    public void setTyreType(String tyreType) {
        this.TyreType = tyreType;
        System.out.println("this is an overriding method");
    }



//    @Override
//    public int getMaxSpeed() {
//        return maxSpeed;
//    }
}
