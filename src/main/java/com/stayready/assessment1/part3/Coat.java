package com.stayready.assessment1.part3;

/**
 * Uncomment `src/test/java/com.stayready.assessment1/part3/CoatTest`
 * Make sure all the test pass.
 *
 * A coat extends a Garment
 */
public class Coat extends Garment {

    /**
     * FIELDS
     *
     * A coat has three fields: price, size, and color.
     * Price and size are implemented in Garment so you
     * only need to add the color field.
     *
     * - create a field called "color" of type String
    */
    private static String color;


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
        super(0, "Universal"); 
        Coat.color = "Black";
    }

    public Coat(double price){
        super(price, "Universal"); 
        Coat.color = "Black"; 

    }

    public Coat(double price, String size, String color){
        super(price, size); 
        Coat.color = color;

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
         return Coat.color;
     }

     public void setColor(String newColor){
         Coat.color = newColor;
     }

     public String getDescription(){
         return "This is a "+ getSize() + " " + getColor() + " coat. It costs $" + getPrice();
     }

}
