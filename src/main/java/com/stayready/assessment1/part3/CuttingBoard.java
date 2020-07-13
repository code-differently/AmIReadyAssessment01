package com.stayready.assessment1.part3;

/**
 * Uncomment `src/test/java/com.stayready.assessment1/part3/CuttingBoardTest`
 * Make sure all the test pass.
 *
 * A CuttingBoard implements Product
 */
public class CuttingBoard
{
    /**
     * FIELDS
     *
     * A cutting board has two instance fields:
     *  - price is a double
     */

    private double price;

     public CuttingBoard(double price)
     {
         this.price = price;
     }


     public double getPrice()
     {
         return this.price;
     }

     public String getDescription()
     {
        return "This cutting board costs $" + getPrice();
     }

}
