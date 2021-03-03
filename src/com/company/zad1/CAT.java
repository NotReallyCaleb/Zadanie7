package com.company.zad1;

public class CAT extends ANIMAL {
    public CAT(String NAME, String COLOUR) {
        super(NAME, COLOUR);
    }
    public void makeSOUND() {
        System.out.println("A cat called " + NAME + " with " + COLOUR + " fur makes a 'Meow' sound");
    }
}
