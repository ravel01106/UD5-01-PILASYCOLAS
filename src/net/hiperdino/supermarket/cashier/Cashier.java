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
        this.customerQueue.add(newCustomer);
        System.out.println("-> The costumer " + newCustomer.getName() + " has joined the queue.");
    }

    public void customerService() {
        String msg = "-> There are no customers in the queue.";
        if (this.customerQueue.size() != 0) {
            msg = "-> " + this.customerQueue.peek().getName() + " has been attended to.";
            this.customerQueue.poll();
        }
        System.out.println(msg);
    }

    public String showCustomerInQueue() {
        String msg = "-> There are no customers in the queue.";
        if (this.customerQueue.size() != 0) {
            msg = "-> Customers in the queue:\n";
            for (Customer customer : this.customerQueue) {
                msg += "-> " + customer.getName() + ".\n";
            }
        }
        return msg;
    }

    @Override
    public String toString() {
        String msg = "CASHIER ATTIBUTES:\n";
        msg += "-> Cash register number: " + this.numCashRegister + ".\n";
        msg += "-> Total customer: " + this.customerQueue.size() + ".\n";
        // Iterator<Customer> iteratorCustomer = this.customerQueue.iterator();
        // while (iteratorCustomer.hasNext()) {
        // msg += "-> " + iteratorCustomer.next().getName() + ".\n";
        // }
        msg += showCustomerInQueue();
        return msg;
    }

}
