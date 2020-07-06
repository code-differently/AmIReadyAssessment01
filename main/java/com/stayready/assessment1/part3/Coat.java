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

    //int price;
    //String size;
    String color;

    public String color(){
        return color;
    }

    
    //CONSTRUCTOR
    //Create three constructors:
    //an empty constructor which takes no params. Initialize
    //price to 0 and size to "Universal", and color to "Black".
    
    int price;
    String size;
    //String color;

    public Coat(){
        this.price = 0;
        this.size = "Universal";
        this.color = "Black";
    }
    //a constructor that takes a "price". Set the instance price field to the parameter field.
    //Set the size to "Universal" and color to "Black".

    public Coat(double price2){
        size = "Universal";
        color = "Black";
    }

    //a constructor that takes a price, size, and color.
    //Set the params to the instance fields.
    public Coat(int price, String size, String color){
        price = 0;
        size = "Universal";
        color = "Black";
    }


     

        

    
    


    //METHODS
    //Create a getter method called "String getColor" to return the color.
    //The return type is String.

    public String getColor(){
        return color;
    }

    public Integer getPrice(){
        return price;
    }

    public String getSize(){
        return size;
    }

    //Create a setter method called "void setColor(String newColor)"
    //which takes the color from the param and set it to the instance field.

    public void setColor(String newColor){
        this.color = newColor;
    }


    //Add a new method called "String getDescription()".
    //It returns a String description of the object.
    //It should be formatted like this:
    //This is a [size] [color] coat. It costs $[price]"
    //Example: "This is a Large Green coat. It costs $19.99"

    public String getDescription(){

        Coat coat = new Coat(price, size, color);
    
        return size; 
        //Coat description = new Coat(0, "universal", "black");
       //String size = size.getSize("universal");
       //String color = new String("black");
       //int price = description.getPrice();

    }


}
