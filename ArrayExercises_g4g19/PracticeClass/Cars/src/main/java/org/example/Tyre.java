package org.example;

public class Tyre {

    public String winter;
    public String summer;

    public Tyre(String goodYear, String dunlop) {
        this.winter = goodYear;
        this.summer = dunlop;
        System.out.println("calling the tyre constructor");
    }

    public String getGoodYear() {
        return winter;
    }

    public void setGoodYear(String goodYear) {
        this.winter = goodYear;
    }

    public void setDunlop(String dunlop) {
        this.summer = dunlop;
    }

    public String getDunlop() {
        return summer;
    }
}
