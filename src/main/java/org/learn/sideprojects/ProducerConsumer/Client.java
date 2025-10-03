package org.learn.sideprojects.ProducerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        Store store = new Store(5);

        for(int i = 1; i <= 8; i++) {
            executor.execute(new Producer(store));
        }

        for (int i = 1; i <= 20; i++) {
            executor.execute(new Consumer(store));
        }

    }

}
