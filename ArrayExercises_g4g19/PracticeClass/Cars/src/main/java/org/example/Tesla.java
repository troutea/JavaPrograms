package org.example;

public class Tesla extends Cars {
    private String Red;
    private String white;
    public int maxSpeed = 100;


    public void getYear(int year)
    {
        System.out.println("Calling get Year from Tesla Cars");
        System.out.println("The year of the car is " + year);
    }
    public void getColor(String color)
    {
        System.out.println("Calling get Year from Tesla Cars");
        System.out.println("The year of the car is " + color);
    }
    public int getMaxSpeed(int maxSpeed)
    {
        System.out.println("The max speed of the Tesla: is  " + maxSpeed );
        return maxSpeed;
    }

    public void start() {
        System.out.println("The Tesla engine is starting");
    }

    public void stop() {
        System.out.println("The Tesla engine is stopping");
    }

}
