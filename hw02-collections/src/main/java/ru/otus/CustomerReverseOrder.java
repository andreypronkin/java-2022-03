package ru.otus;


import java.util.*;

public class CustomerReverseOrder {

    Deque<Customer> queue = new ArrayDeque<>();

    public void add(Customer customer) {
        queue.addLast(customer);
    }

    public Customer take() {
        return queue.pollLast();
    }
}
