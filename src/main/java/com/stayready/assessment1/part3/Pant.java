package com.stayready.assessment1.part3;

/**
 * Uncomment `src/test/java/com.stayready.assessment1/part3/PantTest` Make sure
 * all the test pass.
 *
 * A pant extends a Garment
 */
public class Pant extends Garment {

    /**
     * FIELDS
     *
     * A pant has three fields: price, size, and length. Price and size are
     * implemented in Garment so you only need to add the length field.
     *
     * - create a field called "length" of type int
     */
    double price;
    String size;
    int length;

    /*
     * CONSTRUCTOR
     *
     * Create three constructors: 1. an empty constructor which takes no params.
     * Initialize Initialize price to 0 and size to "Universal", and length 32.
     *
     * 2. a constructor that takes a "price" and "size". Set the instance price and
     * size field to the parameter field. Set the length to 32.
     *
     * 3. a constructor that takes a price, size, and length. Set the params to the
     * instance fields.
     *
     */
    public Pant() {
        price = 0;
        size = "Universal";
        length = 32;
    }

    public Pant(double newPrice, String newSize) {
        price = newPrice;
        size = newSize;
        length = 32;
    }

    public Pant(double newPrice, String newSize, int newLength) {
        price = newPrice;
        size = newSize;
        length = newLength;
    }

    /*
     * METHODS
     *
     * 1. Create a getter method called "int getLength()" to return the length. The
     * return type is int.
     *
     * 2. Create a setter method called "void setLength(int newLength)" which set
     * the length.
     *
     * 3. Add a new method called "String getDescription()". It returns a String
     * description of the object. It should be formatted like this:
     * "This is a pant. It is [size]. It is [length]cm. It costs $[price]" Example:
     * "This is a pant. It is Large. It is 32cm. It costs $19.99"
     */
    public void setLength(int newLength) {
        length = newLength;
    }

    public int getLength() {
        return length;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setLength(String newSize) {
        size = newSize;
    }

    public String getSize() {
        return size;
    }

    public String getDescription() {
        return ("This is a pant. It is " + size + "." + " It is " + length + "cm." + " It costs $" + price);
    }

}
