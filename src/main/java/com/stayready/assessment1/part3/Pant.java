package com.stayready.assessment1.part3;

/**
 * Uncomment `src/test/java/com.stayready.assessment1/part3/PantTest`
 * Make sure all the test pass.
 *
 * A pant extends a Garment
 */
public class Pant extends Garment{

    /**
     * FIELDS
     *
     * A pant has three fields: price, size, and length.
     * Price and size are implemented in Garment so you
     * only need to add the length field.
     *
     * - create a field called "length" of type int
     */
    private int length;


    /*
     * CONSTRUCTOR
     *
     * Create three constructors:
     * 1. an empty constructor which takes no params. Initialize
     *      Initialize price to 0 and size to "Universal", and length 32.
     *
     * 2. a constructor that takes a "price" and "size".
     *      Set the instance price and size field to the parameter field.
     *      Set the length to 32.
     *
     * 3. a constructor that takes a price, size, and length.
     *     Set the params to the instance fields.
     *
     */
    public Pant() {
        super(0.0, "Universal");
        this.length = 32;
    }

    public Pant(double price, String size) {
        super(price, size);
        this.length = 32;
    }

    public Pant(double price, String size, int length) {
        super(price, size);
        this.length = length;
    }

    /*
     * METHODS
     *
     * 1. Create a getter method called "int getLength()" to return the length.
     *    The return type is int.
     *
     * 2. Create a setter method called "void setLength(int newLength)"
     *    which set the length.
     *
     * 3. Add a new method called "String getDescription()".
     *  It returns a String description of the object.
     *  It should be formatted like this:
     *  "This is a pant. It is [size]. It is [length]cm. It costs $[price]"
     *  Example: "This is a pant. It is Large. It is 32cm. It costs $19.99"
     */
    public int getLength() {
        return this.length;
    }

    public void setLength(int newLength) {
        this.length = newLength;
    }

    public String getDescription() {
        return "This is a pant. It is " + getSize() + ". It is " + getLength() + "cm. It costs $" + getPrice();
    }


}
