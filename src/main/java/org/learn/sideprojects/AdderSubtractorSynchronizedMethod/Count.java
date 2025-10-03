package org.learn.sideprojects.AdderSubtractorSynchronizedMethod;

public class Count {
    private int count;

    public Count() {
        this.count = 0;
    }

    public int getCount() {
        return count;
    }

    public synchronized void increment() {
        count += 1;
    }

    public synchronized void decrement() {
        count -= 1;
    }
}
