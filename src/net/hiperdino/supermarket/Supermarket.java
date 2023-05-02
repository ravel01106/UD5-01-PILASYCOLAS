package net.hiperdino.supermarket;

import java.util.Scanner;
import net.hiperdino.supermarket.cashier.Cashier;
import net.hiperdino.supermarket.customer.Customer;

public class Supermarket {
    final static Scanner KEYBOARD = new Scanner(System.in);

    public static void menu() {
        String msg = "\nWelcome to our supermarket!\n";
        msg += "What would you like to do?\n";
        msg += "\t1 -> Open cash register.\n";
        msg += "\t2 -> Add a new customer in the queue.\n";
        msg += "\t3 -> Attend to customer.\n";
        msg += "\t4 -> Display remaining customer.\n";
        msg += "\t5 -> Close supermarket.\n";
        System.out.println(msg);
    }

    public static void main(String[] args) throws Exception {
        String option = "1";
        String msg = "";
        Cashier cashierOne = new Cashier();
        while (!option.equals("5")) {
            menu();
            option = KEYBOARD.nextLine();
            switch (option) {
                case "1":
                    cashierOne.openCashRegister();
                    break;
                case "2":
                    if (cashierOne.getIsOpenCashRegister()) {
                        cashierOne.addCustomer(new Customer());

                    } else {
                        msg = "-> The cash register is closed.";
                    }
                    break;
                case "3":
                    if (cashierOne.getIsOpenCashRegister()) {
                        cashierOne.customerService();

                    } else {
                        msg = "-> The cash register is closed.";
                    }

                    break;
                case "4":
                    if (cashierOne.getIsOpenCashRegister()) {
                        System.out.println(cashierOne.toString());

                    } else {
                        msg = "-> The cash register is closed.";
                    }
                    break;
                case "5":
                    if (cashierOne.getIsOpenCashRegister()) {
                        cashierOne.closeCashRegister();
                    }
                    msg = "Closing the supermarket...\nSee you next time!";
                    break;

                default:
                    msg = "Option incorrect, please try again: ";
                    break;
            }
            System.out.println(msg);

        }
    }
}
