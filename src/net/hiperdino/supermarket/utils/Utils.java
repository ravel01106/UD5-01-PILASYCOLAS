package net.hiperdino.supermarket.utils;

import java.util.Random;

public class Utils {
    static final int MINIMUM_DEFAULT = 1;
    static final int MAXIMUM_DEFAULT = 10;
    static final private String[] PRODUCTS = new String[] {
            "Biscuit",
            "Ham",
            "Cheese",
            "Milk",
            "Bread",
            "Rice",
            "olive",
            "tomato",
            "onion",
            "lettuce",
            "tuna",
            "anchovy",
            "Butter",
            "flour",
            "egg",
            "spicy pork sausage",
            "sausage",
            "Serrano ham",
            "Coffee",
            "Coca"
    };
    static final private String[] NAME_COSTUMER = new String[] {
            "Amanda",
            "Adrian",
            "Saul",
            "Miriam",
            "Maria",
            "David",
            "Marco",
            "Pablo",
            "Alvaro",
            "P.Vadillo",
            "Oliver",
            "Alba",
            "Tory",
            "Jesus",
            "Keny",
            "Danna",
            "Tina",
            "Ana",
            "Sofia",
            "Manuel"
    };

    public static String getRandomProduct() {
        Random numRandom = new Random();
        int numIndex = numRandom.nextInt(PRODUCTS.length);
        return PRODUCTS[numIndex];
    }

    public static String getRandomName() {
        Random numRandom = new Random();
        int numIndex = numRandom.nextInt(NAME_COSTUMER.length);
        return NAME_COSTUMER[numIndex];
    }

    public static int RandomNumProducts() {
        Random numRandom = new Random();
        int numberProducts = (numRandom.nextInt((MAXIMUM_DEFAULT + MINIMUM_DEFAULT) - 1) + MINIMUM_DEFAULT);
        return numberProducts;
    }

}
