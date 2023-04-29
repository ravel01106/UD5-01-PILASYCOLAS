package net.hiperdino.supermarket;

import net.hiperdino.supermarket.costumer.Costumer;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Costumer personOne = new Costumer(3);
        System.out.println(personOne.toString());
        Costumer personTwo = new Costumer(0);
        System.out.println(personTwo.toString());
    }
}
