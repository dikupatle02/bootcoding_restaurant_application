package com.bootcoding.restaurant.utils;

public enum MenuItemEnum {
    PANEER_MASALA("Panner Masala", true, "VEG_RESTAURANT"),
    CHICKEN_MASALA("Chicken Masala", false, "NON_VEG_RESTAURANT"),

    MARGHERITA( "Margherita", true, "DOMINOS"),
    SPICY_MEXICANA("Spicy Mexicana", true, "DOMINOS"),
    DOUBLE_CHEESE_MARGHERITA("Double Cheese Margherita", true, "DOMINOS"),
    ONION_PIZZA("Onion Pizza",true, "DOMINOS"),
    TOMATO_PIZZA("Tomato Pizza",true,"DOMINOS"),
    FRENCH_FRIES("French Fries",true,"VEG_RESTAURANT"),
    TANDOORI_PANNER("Tandoori Paneer",true, "VEG_RESTAURANT"),
    PEPPY_PANEER("Peppy Paneer",true,"VEG_RESTAURANT"),
    CHEEZE_N_CORN("Cheeze N Corn",true,"VEG_RESTAURANT"),
    PANNER_MAKHANI("Paneer Makhani",true,"VEG_RESTAURANT");

    private MenuItemEnum(String name, boolean isVeg, String category){
        this.name=name;
        this.veg=isVeg;
        this.category=category;

    }

    public String getName() {
        return name;
    }

    public boolean isVeg() {
        return veg;
    }

    public String getCategory() {
        return category;
    }

    private String name;
    private boolean veg;
    private String category;

}
