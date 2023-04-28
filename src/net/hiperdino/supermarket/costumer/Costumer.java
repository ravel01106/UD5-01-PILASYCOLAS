package net.hiperdino.supermarket.costumer;

import java.util.Stack;

import net.hiperdino.supermarket.utils.Utils;

public class Costumer {
    private String name;
    private int numberProducts;
    private Stack<String> stackProducts = new Stack<>();

    public Costumer(int numberProducts) {
        String msg = "El cliente aun no ha cogido ningún producto";
        this.numberProducts = numberProducts;
        this.name = Utils.getRandomName();
        if (numberProducts != 0) {
            for (int i = 0; i < numberProducts; i++) {
                stackProducts.push(Utils.getRandomProduct());
            }
        } else {
            System.out.println(msg);
        }
    }

    public String getName() {
        return name;
    }

    public Stack<String> getStackProducts() {
        return stackProducts;
    }

}
