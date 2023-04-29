package net.hiperdino.supermarket;

import net.hiperdino.supermarket.costumer.Customer;
import net.hiperdino.supermarket.cashier.Cashier;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Customer personOne = new Customer(3);
        System.out.println(personOne.toString());
        Customer personTwo = new Customer(0);
        System.out.println(personTwo.toString());
        Cashier personCashier = new Cashier(1234);
        personCashier.openCashRegister();
        personCashier.openCashRegister();
        // personCashier.closeCashRegister();
        personCashier.addCustomer(personOne);
        personCashier.addCustomer(personTwo);
        System.out.println(personCashier.toString());
    }
}
