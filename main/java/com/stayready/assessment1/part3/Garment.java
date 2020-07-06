package com.stayready.assessment1.part3;

/**
 *
 *  Uncomment `src/test/java/com.stayready.assessment1/part3/GarmentTest`
 *  and make sure all the test in the class pass.
 *
 *  Garment is an abstract class. It implements Product.
 */
public class Garment {
    /**
     * FIELDS
     *
     * A garment has two instance fields:
     *  - price is a double
     *  - size is a String
     */
    
     String size;
     Double price;

    //public Double price String size(){
       // return price;
    //}



    //CONSTRUCTORS
    //There should be three constructors:
    //An empty constructor that does not take in any argument.
    // In this constructor, initialize price to 0 and
    //size to "Universal".
    //double price;
    //String size;
    //String color;

    public Garment(){
        price = 0.0;
        size = "Universal";
    }

     
    //A constructor that takes the price and set it to the price field.
    //Set the size to "Universal".
    public Garment(double price){
        this.price = 0.0;
    }


    
    //A constructor that takes two fields double price and String size.
    public Garment(double price, String size){
        price = 0;
        size = "Universal";
    }
     


    //METHODS
    //Create a getter method called "getPrice" to return the price.
    //The return type is double.
    public Double getPrice(){
        return price;
    }


    //Create a getter method called "getSize" which return the size.
    //The return type is String.
    public String getSize(){
        return size;
    }
    }
    
