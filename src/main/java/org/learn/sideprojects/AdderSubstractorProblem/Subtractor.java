package org.learn.sideprojects.AdderSubstractorProblem;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    private Count count;
    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            count.decrement();
        }
    }
}
