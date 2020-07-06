package com.stayready.assessment1.part3;

/**
 * Uncomment `src/test/java/com.stayready.assessment1/part3/CoatTest`
 * Make sure all the test pass.
 *
 * A coat extends a Garment
 */
public class Coat {

    /**
     * FIELDS
     *
     * A coat has three fields: price, size, and color.
     * Price and size are implemented in Garment so you
     * only need to add the color field.
     *
     * - create a field called "color" of type String
    */
    private String color;
    private double price;
    private String size;

    /*
     * CONSTRUCTOR
     *
     * Create three constructors:
     * 1. an empty constructor which takes no params. Initialize
     *      price to 0 and size to "Universal", and color to "Black".
     *
     * 2. a constructor that takes a "price". Set the instance price field
     *      to the parameter field.
     *      Set the size to "Universal" and color to "Black".
     *
     * 3. a constructor that takes a price, size, and color.
     *     Set the params to the instance fields.
     *
     */
    public Coat(){
        price = 0;
        size = "Universal";
        color = "Black";
    }

    public Coat(double price){
        this.price = price;
        size = "Universal";
        color = "Black";
    }
    public Coat(double price, String size, String color){
        this.price = price;
        this.size = size;
        this.color = color;
    }

    /*
     * METHODS
     *
     * 1. Create a getter method called "String getColor" to return the color.
     *    The return type is String.
     *
     * 2. Create a setter method called "void setColor(String newColor)"
     *  which takes the color from the param and set it to the instance field.
     *
     * 3. Add a new method called "String getDescription()".
     *      It returns a String description of the object.
     *      It should be formatted like this:
     *      "This is a [size] [color] coat. It costs $[price]"
     *      Example: "This is a Large Green coat. It costs $19.99"

     */
    public String getColor(){
        return color;
    }

    public void setColor(String newColor){
        color = newColor;
    }

    public String getDescription(){
       return String.format("This is a %s %s coat. It costs $%.2f",size,color,price);
    }
}
