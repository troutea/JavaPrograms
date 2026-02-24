package org.example;

public class Tesla extends Cars {

    private int maxSpeed = 100;
    private String TyreType;

    public Tesla() {
        System.out.println("Calling the Tesla constructor for Cars with no initial values set");
    }




    public void setTyreType(String tyreType) {
        this.TyreType = tyreType;
        System.out.println("this is an Tesla overriding method SetTyreType");
    }
    @Override
    public String getTyreType() {
        System.out.println("Calling the getTyre from Tesla");
        super.getTyreType();
        return TyreType;

    }



}
