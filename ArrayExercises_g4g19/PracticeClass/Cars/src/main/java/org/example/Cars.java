package org.example;

abstract class Cars {
    public String Model;
    public int VIN;
    public int age;
    public String brakeType;
    public String TyreType;
    public String electric;
    public String combustion;
    public int MaxSpeed;


    public abstract void getYear(int year);
    public abstract void getColor(String Color);
    public abstract int getMaxSpeed(int speed);
    public abstract void start();
    public abstract void stop();


}
