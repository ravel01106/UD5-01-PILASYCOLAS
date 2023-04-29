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
        Customer personThree = new Customer(10);
        System.out.println(personThree.toString());
        Cashier personCashier = new Cashier(1234);
        personCashier.openCashRegister();
        personCashier.openCashRegister();
        // personCashier.closeCashRegister();
        personCashier.addCustomer(personOne);
        personCashier.addCustomer(personTwo);
        personCashier.addCustomer(personThree);
        System.out.println("------------------------------------------------");
        System.out.println(personCashier.toString());
        personCashier.customerService();
        System.out.println("------------------------------------------------");
        System.out.println(personCashier.showCustomerInQueue());
        personCashier.customerService();
        personCashier.customerService();
        System.out.println("------------------------------------------------");
        System.out.println(personCashier.showCustomerInQueue());

    }
}
