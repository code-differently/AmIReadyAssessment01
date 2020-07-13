package com.stayready.assessment1.part3;

/**
 *
 *  Uncomment `src/test/java/com.stayready.assessment1/part3/GarmentTest`
 *  and make sure all the test in the class pass.
 *
 *  Garment is an abstract class. It implements Product.
 */
public class Garment {

    private double price;
    private String size;


    public Garment()
    {
        price = 0;
        size = "Universal";
    }

    public Garment(double price)
    {
        this.price = price;
        this.size = "Universal";
    }

    public Garment(double price, String size)
    {
        this.price = price;
        this.size = size;
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

    public double getPrice()
    {
        return this.price;
    }

    public String getSize()
    {
        return this.size;
    }
}