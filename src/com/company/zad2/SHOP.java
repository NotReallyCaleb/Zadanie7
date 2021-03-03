package com.company.zad2;

public class SHOP {
    protected String ADDRESS;
    protected String SIZE;

    SHOP(String ADDRESS, String SIZE) {
        this.ADDRESS = ADDRESS;
        this.SIZE = SIZE;
    }
    public void get_INFO() {
        System.out.println("The shop is located on " + ADDRESS + "and is " + SIZE + " m^2 big");
    }
}
