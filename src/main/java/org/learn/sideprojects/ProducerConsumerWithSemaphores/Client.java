package org.learn.sideprojects.ProducerConsumerWithSemaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        Store store = new Store(5);
        Semaphore producerSemaphore = new Semaphore(5); // Producers can produce up to 5 items
        Semaphore consumerSemaphore = new Semaphore(0); // Consumers can consume only when items are available

        for(int i = 1; i <= 8; i++) {
            executor.execute(new Producer(store));
        }

        for (int i = 1; i <= 20; i++) {
            executor.execute(new Consumer(store));
        }

    }

}
