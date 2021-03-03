package com.company.zad2;

public class BOOKSHOP extends SHOP {
    private String[] PRODUCTS = {"- 'Ten okrutny wiek'", "- 'Testament Odessy'", "- 'Sensacje XX wieku: II Wojna Światowa'"};
    BOOKSHOP(String ADDRESS, String SIZE) {
        super(ADDRESS, SIZE);
    }
    @Override
    public void get_INFO() {
        super.get_INFO();
        System.out.println("Asortyment książek naszego sklepu: ");
        for (String i : PRODUCTS) {
            System.out.println(i);
        }
    }
}
