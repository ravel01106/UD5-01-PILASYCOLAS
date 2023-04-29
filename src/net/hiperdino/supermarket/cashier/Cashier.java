package net.hiperdino.supermarket.cashier;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

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
        String msg = "-> The cash register is closed.";
        if (isOpenCashRegister) {
            this.customerQueue.add(newCustomer);
            msg = "-> The costumer " + newCustomer.getName() + " has joined the queue.";
        }
        System.out.println(msg);
    }

    public void customerService() {
        String msg = "-> There are no customers in the queue.";
        if (this.customerQueue.size() != 0) {
            msg = "-> " + this.customerQueue.peek() + " has been attended to.";
            this.customerQueue.poll();
        }
        System.out.println(msg);
    }

    @Override
    public String toString() {
        String msg = "CASHIER ATTIBUTES:\n";
        msg += "-> Cash register number: " + this.numCashRegister + ".\n";
        msg += "-> Total customer: " + this.customerQueue.size() + ".\n";
        msg += "-> Customer in the queue:\n";
        // Iterator<Customer> iteratorCustomer = this.customerQueue.iterator();
        // while (iteratorCustomer.hasNext()) {
        // msg += "-> " + iteratorCustomer.next().getName() + ".\n";
        // }
        for (Customer customer : this.customerQueue) {
            msg += "-> " + customer.getName() + ".\n";
        }
        return msg;
    }

}
