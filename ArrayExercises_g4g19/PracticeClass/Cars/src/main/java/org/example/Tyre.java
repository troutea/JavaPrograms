package org.example;

public class Tyre {

    private String goodYear;
    private String dunlop;

    public Tyre(String goodYear, String dunlop) {
        this.goodYear = goodYear;
        this.dunlop = dunlop;
    }

    public String getGoodYear() {
        return goodYear;
    }

    public void setGoodYear(String goodYear) {
        this.goodYear = goodYear;
    }

    public void setDunlop(String dunlop) {
        this.dunlop = dunlop;
    }

    public String getDunlop() {
        return dunlop;
    }
}
