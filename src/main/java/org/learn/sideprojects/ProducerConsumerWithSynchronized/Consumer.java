package org.learn.sideprojects.ProducerConsumerWithSynchronized;

public class Consumer implements Runnable{
    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (store) {
                if (store.getItems().size() > 0) {
                    store.removeItem(store.getItems().get(store.getItems().size() - 1));
                }
            }
        }
    }
}
