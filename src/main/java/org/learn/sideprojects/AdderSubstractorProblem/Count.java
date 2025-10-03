package org.learn.sideprojects.AdderSubstractorProblem;

public class Count {
    private int count;

    public Count() {
        this.count = 0;
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        count += 1;
    }

    public void decrement() {
        count -= 1;
    }
}
