package com.example.cateringmanager_saklaenhaamim_2221380;

public class CateringManager {
    private String CateringSchhedule;
    private String addMeal;
    private String searchMeal;
    private String deleteMeal;
    private String ensureQuality;
    private String reviewQualty;
    private String loadOrder;
    private String printOrder;

    public String getCateringSchhedule() {
        return CateringSchhedule;
    }

    public void setCateringSchhedule(String cateringSchhedule) {
        CateringSchhedule = cateringSchhedule;
    }

    public String getAddMeal() {
        return addMeal;
    }

    public void setAddMeal(String addMeal) {
        this.addMeal = addMeal;
    }

    public String getSearchMeal() {
        return searchMeal;
    }

    public void setSearchMeal(String searchMeal) {
        this.searchMeal = searchMeal;
    }

    public String getDeleteMeal() {
        return deleteMeal;
    }

    public void setDeleteMeal(String deleteMeal) {
        this.deleteMeal = deleteMeal;
    }

    public String getEnsureQuality() {
        return ensureQuality;
    }

    public void setEnsureQuality(String ensureQuality) {
        this.ensureQuality = ensureQuality;
    }

    public String getReviewQualty() {
        return reviewQualty;
    }

    public void setReviewQualty(String reviewQualty) {
        this.reviewQualty = reviewQualty;
    }

    public String getLoadOrder() {
        return loadOrder;
    }

    public void setLoadOrder(String loadOrder) {
        this.loadOrder = loadOrder;
    }

    public String getPrintOrder() {
        return printOrder;
    }

    public void setPrintOrder(String printOrder) {
        this.printOrder = printOrder;
    }

    public CateringManager(String cateringSchhedule, String addMeal, String searchMeal, String deleteMeal, String ensureQuality, String reviewQualty, String loadOrder, String printOrder) {
        CateringSchhedule = cateringSchhedule;
        this.addMeal = addMeal;
        this.searchMeal = searchMeal;
        this.deleteMeal = deleteMeal;
        this.ensureQuality = ensureQuality;
        this.reviewQualty = reviewQualty;
        this.loadOrder = loadOrder;
        this.printOrder = printOrder;

    }

    @Override
    public String toString() {
        return "CateringManager{" +
                "CateringSchhedule='" + CateringSchhedule + '\'' +
                ", addMeal='" + addMeal + '\'' +
                ", searchMeal='" + searchMeal + '\'' +
                ", deleteMeal='" + deleteMeal + '\'' +
                ", ensureQuality='" + ensureQuality + '\'' +
                ", reviewQualty='" + reviewQualty + '\'' +
                ", loadOrder='" + loadOrder + '\'' +
                ", printOrder='" + printOrder + '\'' +
                '}';
    }
}
