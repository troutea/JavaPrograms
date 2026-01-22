package org.example;

class Cars {
    private String Model;
    private int VIN;
    private int age;
    private String brakeType;
    private String TyreType;
    private boolean electric;
    private boolean combustion;
    public int MaxSpeed;

    public void setModel(String model) {
        Model = model;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBrakeType(String brakeType) {
        this.brakeType = brakeType;
    }

    public void setTyreType(String tyreType) {
        this.TyreType = tyreType;
        System.out.println("calling the original method");
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public void setCombustion(boolean combustion) {
        this.combustion = combustion;
    }

    public void setMaxSpeed(int maxSpeed) {
        MaxSpeed = maxSpeed;
    }

    public String getModel() {
        return Model;
    }

    public int getVIN() {
        return VIN;
    }

    public int getAge() {
        return age;
    }

    public String getBrakeType() {
        return brakeType;
    }

    public String getTyreType() {
        return TyreType;
    }

    public boolean isElectric() {
        return electric;
    }

    public boolean isCombustion() {
        return combustion;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }
}
