package org.learn.sideprojects.ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int maxItems;
    private List<Object> items;

    Store(int maxItems) {
        this.maxItems = maxItems;
        this.items = new ArrayList<Object>();
    }

    public int getMaxItems() {
        return maxItems;
    }

    public List<Object> getItems() {
        return items;
    }

    public void addItem(Object item) {
        System.out.println("Producing " + item + " to " + maxItems + ". Current size: " + items.size());
        items.add(item);
    }

    public void removeItem(Object item) {
        System.out.println("Removing " + item + " from " + maxItems + ". Current size: " + items.size());
        items.remove(item);
    }
}
