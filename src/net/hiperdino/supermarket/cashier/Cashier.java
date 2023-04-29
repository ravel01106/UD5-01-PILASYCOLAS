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

}
