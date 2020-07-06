package com.stayready.assessment1.part3;

/**
 * Uncomment `src/test/java/com.stayready.assessment1/part3/CuttingBoardTest`
 * Make sure all the test pass.
 *
 * A CuttingBoard implements Product
 */
public class CuttingBoard {
    /**
     * FIELDS
     *
     * A cutting board has two instance fields:
     *  - price is a double
     */
    double price;



    /*
     * CONSTRUCTOR
     *
     * Create 1 constructor that takes a "price". Set the instance price field
     * to the parameter price.
     *
     */
    public CuttingBoard(double price) {
        this.price = price;
    }




    /*
     * METHODS
     *
     * 1. Create a getter method called "getPrice" to return the price.
     *    The return type is double.
     *
     * 2. Create a method called "getDescription()". It returns a
     *  String description of the object.
     *      It should be formatted like this:
     *      "This cutting board costs $[price]"
     *      Example: "This cutting board costs $19.99"
     */
    public double getPrice() {
        return price;
    }

    public String getDescription() {
        String description = "This cutting board costs $" + price;
        return description;
    }

}
