package net.hiperdino.supermarket.cashier;

import java.util.LinkedList;
import java.util.Queue;

import net.hiperdino.supermarket.costumer.Customer;

public class Cashier {
    private int numCashRegister;
    private Queue<Customer> customerQueue = new LinkedList<>();
    private boolean isOpenCashRegister;

    public Cashier(int numCashRegister) {
        this.numCashRegister = numCashRegister;
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

    public void openCashRegister() {
        String msg = "The cash resgister was already open.";
        if (!isOpenCashRegister) {
            msg = "The cash register is open, the customer can pass.";
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
        String msg = "The cash register is closed.";
        if (isOpenCashRegister) {
            this.customerQueue.add(newCustomer);
            msg = "The costumer " + newCustomer.getName() + " has joined the queue.";
        }
        System.out.println(msg);
    }

}
