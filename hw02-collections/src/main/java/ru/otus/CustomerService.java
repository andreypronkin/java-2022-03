package ru.otus;

import java.util.*;

public class CustomerService {

    TreeMap<Customer, String> map = new TreeMap<>(Comparator.naturalOrder());

    public Map.Entry<Customer, String> getSmallest() {
        Map.Entry<Customer, String> smallest =  map.firstEntry();

        if (smallest == null) {
            return null;
        }

        try {
            return Map.entry((Customer)smallest.getKey().clone(), smallest.getValue());
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        Map.Entry<Customer, String> next =  map.higherEntry(customer);

        if (next == null) {
            return null;
        }
        try {
            return Map.entry((Customer)next.getKey().clone(), next.getValue());
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public void add(Customer customer, String data) {
        map.put(customer, data);
    }
}
