package net.hiperdino.supermarket;

import java.util.Scanner;
import net.hiperdino.supermarket.cashier.Cashier;
import net.hiperdino.supermarket.customer.Customer;

public class Supermarket {
    final static Scanner KEYBOARD = new Scanner(System.in);
    static Cashier cashierOne = new Cashier();
    static Cashier cashierTwo = new Cashier();
    static Cashier cashierThree = new Cashier();

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

    public static void openCashierBox() {
        Cashier[] numberCashierRegisterArray = { cashierOne, cashierTwo, cashierThree };
        String msg = "Which cash register do you want to open?:";
        boolean isNumberCorrect = false;

        msg += "Cash register One: " + cashierOne.getNumCashRegister() + ".\n";
        msg += "Cash register Two: " + cashierTwo.getNumCashRegister() + ".\n";
        msg += "Cash register Three: " + cashierThree.getNumCashRegister() + ".\n";
        msg += "Write the number cash register to open it:";
        System.out.println(msg);

        msg = "Number incorrect, try again:";

        while (!isNumberCorrect) {

            try {
                int numberCashierRegister = Integer.parseInt(KEYBOARD.nextLine());

                for (int i = 0; i < numberCashierRegisterArray.length; i++) {

                    if (numberCashierRegister == numberCashierRegisterArray[i].getNumCashRegister()) {
                        numberCashierRegisterArray[i].openCashRegister();
                        isNumberCorrect = true;
                    }
                }

                if (!isNumberCorrect) {
                    System.out.println(msg);
                }

            } catch (NumberFormatException e) {
                System.out.println(msg);

            }

        }
    }

    public static void main(String[] args) throws Exception {
        String option = "1";
        String msg = "";

        while (!option.equals("5")) {

            menu();
            option = KEYBOARD.nextLine();

            switch (option) {

                case "1":
                    openCashierBox();
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
