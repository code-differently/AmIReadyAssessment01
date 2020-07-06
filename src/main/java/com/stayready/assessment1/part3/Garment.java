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
    private static double price; 
    private static String size;


    /**
     * CONSTRUCTORS
     *
     * There should be three constructors:
     * 1. An empty constructor that does not take in any argument.
     *    In this constructor, initialize price to 0 and
     *    size to "Universal".
     *
     * 2. A constructor that takes the price and set it to the price field.
     *    Set the size to "Universal".
     *
     * 3. A constructor that takes two fields double price and String size.
     */
    public Garment(){

    }

    public Garment(double price){
        Garment.price = price; 
        Garment.size = "Universal";
    }

    public Garment(double price, String s){
        Garment.price = price; 
        Garment.size = s;
    }


    /**
     * METHODS
     *
     * 1. Create a getter method called "getPrice" to return the price.
     *    The return type is double.
     *
     * 2.Create a getter method called "getSize" which return the size.
     *    The return type is String.
     */

    public double getPrice(){
        return Garment.price;
    }

    public String getSize(){
        return Garment.size;
    }
}