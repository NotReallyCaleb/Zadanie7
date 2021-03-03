package com.company.zad2;

public class BAKERY extends SHOP {
    private String[] PRODUCTS = {"- Chleb wiejski", "- Bułka paryska", "- Bagietka czosnkowa", "- Serówka"};
    BAKERY(String ADDRESS, String SIZE) {
        super(ADDRESS, SIZE);
    }
    @Override
    public void get_INFO() {
        super.get_INFO();
        System.out.println("Nasze dzisiejsze wypieki: ");
        for (String i : PRODUCTS) {
            System.out.println(i);
        }
    }
}
