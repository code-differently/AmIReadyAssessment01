package com.stayready.assessment1.part3;

/**
 * Uncomment `src/test/java/com.stayready.assessment1/part3/CoatTest`
 * Make sure all the test pass.
 *
 * A coat extends a Garment
 */
public class Coat extends Garment
{

    private String color;

    public Coat()
    {
        super(0, "Universal");
        this.color = "Black";
    }
    public Coat(double price)
    {
        super(price, "Universal");
        this.color = "Black";
    }

    public Coat(double price, String size, String color)
    {
        super(price, size);
        this.color = color;
    }

    public String getColor()
    {
        return this.color;
    }
    public void setColor(String newColor)
    {
        this.color = newColor;
    }

    public String getDescription()
    {
        return "This is a " + getSize() + " " + getColor() + " coat. It costs $" + getPrice();
    }

}
