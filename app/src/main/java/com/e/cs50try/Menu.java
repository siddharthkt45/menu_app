package com.e.cs50try;

public class Menu {
    public int image;
    public String name;
    public int price;
   public Menu(){
       image = 0 ;
       name = "name" ;
       price = 0;
   }
   public Menu(int image_id , String food_name , int price){
        image = image_id;
        name = food_name;
        this.price = price;
    }
}
