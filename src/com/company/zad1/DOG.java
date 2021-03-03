package com.company.zad1;

public class DOG extends ANIMAL {
    public DOG(String NAME, String COLOUR) {
        super(NAME, COLOUR);
    }
    public void makeSOUND() {
        System.out.println("A dog called " + NAME + " with " + COLOUR + " fur makes a 'Woof' sound" );
    }
}
