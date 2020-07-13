package com.stayready.assessment1.part3;

/**
 * Uncomment `src/test/java/com.stayready.assessment1/part3/PantTest`
 * Make sure all the test pass.
 *
 * A pant extends a Garment
 */
public class Pant extends Garment
{

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


     public Pant()
     {
         super(0, "Universal");
         length = 32;
     }

     public Pant(double price, String size)
     {
         super(price, size);
         length = 32;
     }

     public Pant(double price, String size, int length)
     {
        super(price, size);
        this.length = length;
     }


     public int getLength()
     {
         return this.length;
     }

     public void setLength(int newLength)
     {
        this.length = newLength;
     }

     public String getDescription()
     {
         return "This is a pant. It is " + getSize() + ". It is " + getLength() + "cm. It costs $"+ getPrice();
     }

}
