package net.hiperdino.supermarket.costumer;

import java.util.Stack;

import net.hiperdino.supermarket.utils.Utils;

public class Costumer {
    private String name;
    private int numberProducts;
    private Stack<String> stackProducts = new Stack<>();

    public Costumer(int numberProducts) {
        this.numberProducts = numberProducts;
        this.name = Utils.getRandomName();
    }

    public String getName() {
        return name;
    }

    public Stack<String> getStackProducts() {
        return stackProducts;
    }

}
