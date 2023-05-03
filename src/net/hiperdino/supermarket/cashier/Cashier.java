package net.hiperdino.supermarket.cashier;

import java.util.LinkedList;
import java.util.Queue;

import net.hiperdino.supermarket.customer.Customer;

public class Cashier {
    private static int count = 1001;
    private int numCashRegister;
    private Queue<Customer> customerQueue = new LinkedList<>();
    private boolean isOpenCashRegister;

    public Cashier() {
        this.numCashRegister = count;
        incrementCount();
        this.isOpenCashRegister = false;
    }

    public int getNumCashRegister() {
        return numCashRegister;
    }

    public Queue<Customer> getCustomerQueue() {
        return customerQueue;
    }

    public boolean getIsOpenCashRegister() {
        return isOpenCashRegister;
    }

    public static void incrementCount() {
        count++;
    }

    public void openCashRegister() {
        String msg = "The cash resgister was already open.";
        if (!isOpenCashRegister) {
            msg = "The cash register " + numCashRegister + " is opened, the customer can pass.";
            isOpenCashRegister = true;
        }
        System.out.println(msg);
    }

    public void closeCashRegister() {
        String msg = "The cash resgister was already closed.";
        if (isOpenCashRegister) {
            msg = "The cash register is closed, the customer can not pass.";
            isOpenCashRegister = false;
        }
        System.out.println(msg);
    }

    public void addCustomer(Customer newCustomer) {
        this.customerQueue.add(newCustomer);
        System.out.println("-> The costumer " + newCustomer.getName() + " has joined the queue.");
        System.out.println(newCustomer.toString());
    }

    public void customerService() {
        String msg = "-> There are no customers in the queue.";
        if (this.customerQueue.size() != 0) {
            msg = "-> " + this.customerQueue.peek().getName() + " has been attended to.";
            this.customerQueue.poll();
        }
        System.out.println(msg);
    }

    @Override
    public String toString() {
        String msg = "CASHIER DETAILS:\n";
        msg += "-> Cash register number: " + this.numCashRegister + ".\n";
        msg += "-> Total customer: " + this.customerQueue.size() + ".\n";
        if (this.customerQueue.size() != 0) {
            msg += "-> Customers in the queue:\n";
            for (Customer customer : this.customerQueue) {
                msg += "-> " + customer.getName() + ".\n";
            }
        } else {
            msg += "-> There are no customers in the queue.";
        }
        return msg;
    }

}
