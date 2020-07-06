package com.stayready.assessment1.part3;


/*src/test/java/com.stayready.assessment1/part3/PantTest`
 * Make sure all the test pass.
 *
 * A pant extends a Garment
 */

public class Pant {

    /**
     * FIELDS
     *
     * A pant has three fields: price, size, and length.
     * Price and size are implemented in Garment so you
     * only need to add the length field.
     *
     * - create a field called "length" of type int
     */
    int length;


     //CONSTRUCTOR
     // Create three constructors:
     // an empty constructor which takes no params. Initialize
     // Initialize price to 0 and size to "Universal", and length 32.

     int price;
     String size;
    
     //String color;
 
     public Pant(){
         this.price = 0;
         this.size = "Universal";
         this.length = 32;
     }

     //a constructor that takes a "price" and "size".
     //Set the instance price and size field to the parameter field.
     //Set the length to 32.

     public Pant(int price, String size){
        price = 0;
        size = "Universal";
        length = 32;
    }



     //a constructor that takes a price, size, and length.
     //Set the params to the instance fields.

     public Pant(int price, String size, int length){
         price = 0;
         size = "Universal";
         length = 32;
     }





    //METHODS
     
    //Create a getter method called "int getLength()" to return the length.
    //The return type is int.
    public Integer getLength(){
        return length;
    }
     
    //Create a setter method called "void setLength(int newLength)"
    //which set the length.

    public void setLength(int newLength){
        this.length = newLength;
    }
     
    //Add a new method called "String getDescription()".
    //It returns a String description of the object.
    //It should be formatted like this:
    //"This is a pant. It is [size]. It is [length]cm. It costs $[price]"
    //Example: "This is a pant. It is Large. It is 32cm. It costs $19.99"
    //

    public String getDescription(){
        return "idk";
    }

	public double getPrice() {
		return 0;
	}

	public Object getSize() {
		return "Universal";
	}

}
