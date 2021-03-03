package com.company.zad2;

public class Main {
    public static void main(String[] args) {
    SHOP shop = new SHOP("Najmana 420 ", "169");
    shop.get_INFO();
    BOOKSHOP bookshop = new BOOKSHOP("Ofiar Bestii z Wadowic 21/37 ", "2137");
    bookshop.get_INFO();
    BAKERY bakery = new BAKERY("Hajty 15/2 ", "152");
    bakery.get_INFO();
    }
}
