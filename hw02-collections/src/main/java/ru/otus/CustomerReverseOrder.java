package ru.otus;


import java.util.*;

public class CustomerReverseOrder {

    private final Deque<Customer> queue = new ArrayDeque<>();

    public void add(Customer customer) {
        queue.addLast(customer);
    }

    public Customer take() {
        return queue.pollLast();
    }
}
