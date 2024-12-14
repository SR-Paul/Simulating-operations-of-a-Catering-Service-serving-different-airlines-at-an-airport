package com.example.cateringmanager_saklaenhaamim_2221380;

public class LoadOrder {
    private String flightName;
    private String scedule;
    private String mealname;
    private String quantity;

    public LoadOrder(String flightName, String scedule, String mealname, String quantity) {
        this.flightName = flightName;
        this.scedule = scedule;
        this.mealname = mealname;
        this.quantity = quantity;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getScedule() {
        return scedule;
    }

    public void setScedule(String scedule) {
        this.scedule = scedule;
    }

    public String getMealname() {
        return mealname;
    }

    public void setMealname(String mealname) {
        this.mealname = mealname;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "LoadOrder{" +
                "flightName='" + flightName + '\'' +
                ", scedule='" + scedule + '\'' +
                ", mealname='" + mealname + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
