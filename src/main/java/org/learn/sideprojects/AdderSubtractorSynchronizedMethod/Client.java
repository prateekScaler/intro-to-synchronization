package org.learn.sideprojects.AdderSubtractorSynchronizedMethod;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Thread adderThread = new Thread(adder);
        Thread subtractorThread = new Thread(subtractor);

        adderThread.start();
        subtractorThread.start();

        adderThread.join();
        subtractorThread.join();

        System.out.println(count.getCount());
    }

    private void demonstrateSynchronizedMethod() throws InterruptedException {
        Example example1 = new Example();

        //case 1

        example1.add();
        example1.add();

        //case 2
        example1.add();
        example1.subtract();

        //case 3
        example1.subtract();
        example1.multiply();

        //case 4
        Example example2 = new Example();
        example2.add();
        example1.add();

    }
}