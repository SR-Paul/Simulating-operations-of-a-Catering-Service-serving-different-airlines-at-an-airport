package com.example.cateringmanager_saklaenhaamim_2221380;

public class SearchMeal {
    private String mealName;
    private int mealPrice;
    private String mealtype;

    public SearchMeal(String mealName, int mealPrice, String mealtype) {
        this.mealName = mealName;
        this.mealPrice = mealPrice;
        this.mealtype = mealtype;
    }
    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public int getMealPrice() {
        return mealPrice;
    }

    public void setMealPrice(int mealPrice) {
        this.mealPrice = mealPrice;
    }

    public String getMealtype() {
        return mealtype;
    }

    public void setMealtype(String mealtype) {
        this.mealtype = mealtype;
    }

    @Override
    public String toString() {
        return "SearchMeal{" +
                "mealName='" + mealName + '\'' +
                ", mealPrice=" + mealPrice +
                ", mealtype='" + mealtype + '\'' +
                '}';
    }
}
