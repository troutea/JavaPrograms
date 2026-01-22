package org.example;

public class Tesla extends Cars {
    private String Red;
    private String white;
    private int maxSpeed = 100;
    private String TyreType;

    public String getRed() {
        return Red;
    }

    public String getWhite() {
        return white;
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
