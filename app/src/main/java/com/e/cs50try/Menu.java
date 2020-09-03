package com.e.cs50try;

public class Menu {
    private int image;
    private String itemName;
    private int price;

    public Menu(int image, String itemName , int price){
        this.image = image;
        this.itemName = itemName;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public String getItemName() {
        return itemName;
    }

    public int getPrice() {
        return price;
    }
}
