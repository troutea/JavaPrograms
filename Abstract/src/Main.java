abstract class Vehicle {
    //abstract methods
    abstract void accelerate();
    abstract void brake();


    //Concrete method
    void StartEngine() {
        System.out.println("Engine started");
    }
}//class


class Car extends Vehicle {

    @Override
    void accelerate() {
        System.out.println("Car: Pressing gas Pedal....");
    }

    @Override
    void brake() {
        System.out.println("Car: Applying brake");
    }

} // car class




public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Vehicle myCar = new Car();
        myCar.StartEngine();
        myCar.accelerate();
        myCar.brake();

        Car hiscar = new Car();
        hiscar.StartEngine();
        hiscar.accelerate();
        hiscar.brake();
    }
}
