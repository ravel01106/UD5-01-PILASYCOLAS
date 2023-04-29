package net.hiperdino.supermarket;

import net.hiperdino.supermarket.costumer.Customer;
import java.util.Scanner;
import net.hiperdino.supermarket.cashier.Cashier;

public class Supermarket {
    final static Scanner KEYBOARD = new Scanner(System.in);

    public static int numberCashRegister() {
        int numberCashRegister = 0;
        String msg = "Welcome to our supermarket!\n";
        msg += "Please, introduce your cash Register's number: ";
        System.out.println(msg);
        while (true) {
            try {
                numberCashRegister = Integer.parseInt(KEYBOARD.nextLine());
                return numberCashRegister;
            } catch (NumberFormatException e) {
                msg = "Number incorrect, please try again: ";
                System.out.println(msg);
            }
        }
    }

    public static int numberProductsCustomer() {
        int numberProducts = 0;
        String msg = "Please introduce the number of products in the customer's cart: ";
        System.out.println(msg);
        while (true) {
            try {
                numberProducts = Integer.parseInt(KEYBOARD.nextLine());
                return numberProducts;
            } catch (NumberFormatException e) {
                msg = "Number incorrect, please try again: ";
                System.out.println(msg);
            }
        }
    }

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
        Cashier cashierOne = new Cashier(numberCashRegister());
        while (!option.equals("5")) {
            menu();
            option = KEYBOARD.nextLine();
            switch (option) {
                case "1":
                    cashierOne.openCashRegister();
                    break;
                case "2":
                    if (cashierOne.getIsOpenCashRegister()) {
                        cashierOne.addCustomer(new Customer(numberProductsCustomer()));
                    } else {
                        System.out.println("-> The cash register is closed.");
                    }
                    break;
                case "3":
                    cashierOne.customerService();
                    break;
                case "4":
                    System.out.println(cashierOne.showCustomerInQueue());
                    break;
                case "5":
                    if (cashierOne.getIsOpenCashRegister()) {
                        cashierOne.closeCashRegister();
                    }
                    System.out.println("Closing the supermarket...\nSee you next time!");
                    break;

                default:
                    System.out.println("Option incorrect, please try again: ");
                    break;
            }

        }
    }
}
