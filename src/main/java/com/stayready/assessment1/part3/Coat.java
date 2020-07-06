package com.stayready.assessment1.part3
java.lang.String;

/**
 * Uncomment `src/test/java/com.stayready.assessment1/part3/CoatTest`
 * Make sure all the test pass.
 *
 * A coat extends a Garment
 */
public class Coat extends Garment{

    
   String color;


    /*
     * CONSTRUCTOR
     *
     * Create three constructors:
     * 1. an empty constructor which takes no params. Initialize
     *      price to 0 and size to "Universal", and color to "Black".
     * 2. a constructor that takes a "price". Set the instance price field
     *      to the parameter field.
     *      Set the size to "Universal" and color to "Black".
     *
     * 3. a constructor that takes a price, size, and color.
     *     Set the params to the instance fields.
     */
    public void construct(){
    price = 0.0;
    size = "Universal";
    color = "Black";
    }


    public void setPrice(Double price)
    {
        this.price = price;
    }
    public void setSize(String size)
    {
        this.size = "Universal";
    }
    public void setColor(String color)
    {
        this.color = "Black";
    }
    public static void all(Double price, String size, String color)
    {
        this.price = setPrice(price);
        this.size = setSize(size);
        this.color = setColor(color);
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
    public String getColor()
    {
        return this.color;
    }
    public void setColor(String newColor)
    {
        newColor = this.color;
    }
    public String getDescription()
    {
        System.out.print("This is a [size] [color] coat. It costs $[price]");
    }


}
