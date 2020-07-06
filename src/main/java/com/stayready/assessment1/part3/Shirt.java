package com.stayready.assessment1.part3;

public class Shirt extends Garment {

    protected Shirt(double price, String size) {
        super(price, size);
    }

    public Shirt() {
        super();
    }

    public Shirt(double price) {
        super(price);
    }

    public String getDescription() {
        return "shirt";
    }

}