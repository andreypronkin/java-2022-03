package ru.otus;

import java.util.*;

public class CustomerService {

    private final TreeMap<Customer, String> map = new TreeMap<>(Comparator.naturalOrder());

    public Map.Entry<Customer, String> getSmallest() {
        return getEntryOrNull(map.firstEntry());
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        return getEntryOrNull(map.higherEntry(customer));
    }

    private Map.Entry<Customer, String> getEntryOrNull(Map.Entry<Customer, String> entry) {
        if (entry == null) {
            return null;
        }
        try {
            return Map.entry((Customer)entry.getKey().clone(), entry.getValue());
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public void add(Customer customer, String data) {
        map.put(customer, data);
    }
}
