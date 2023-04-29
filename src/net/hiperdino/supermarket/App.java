package net.hiperdino.supermarket;

import net.hiperdino.supermarket.costumer.Customer;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Customer personOne = new Customer(3);
        System.out.println(personOne.toString());
        Customer personTwo = new Customer(0);
        System.out.println(personTwo.toString());
    }
}
