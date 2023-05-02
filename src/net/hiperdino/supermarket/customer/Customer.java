package net.hiperdino.supermarket.customer;

import java.util.Stack;

import net.hiperdino.supermarket.utils.Utils;

public class Customer {
    private String name;
    private int numberProducts;
    private Stack<String> stackProducts = new Stack<>();

    public Customer() {
        this.numberProducts = Utils.RandomNumProducts();
        this.name = Utils.getRandomName();
        pushProducts();
    }

    public String getName() {
        return name;
    }

    public Stack<String> getStackProducts() {
        return stackProducts;
    }

    public void pushProducts() {
        for (int i = 0; i < numberProducts; i++) {
            stackProducts.push(Utils.getRandomProduct());
        }
    }

    @Override
    public String toString() {
        String msg = "CUSTOMER DETAILS:\n";
        msg += "-> Name: " + this.name + ".\n";
        msg += "-> Total products: " + this.numberProducts + ".\n";
        msg += "-> List of items in cart:\n";
        for (int i = 0; i < stackProducts.size(); i++) {
            msg += "\t-> " + stackProducts.get(i) + ".\n";
        }
        return msg;
    }

}
