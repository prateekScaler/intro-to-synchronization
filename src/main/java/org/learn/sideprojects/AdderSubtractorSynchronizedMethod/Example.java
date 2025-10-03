package org.learn.sideprojects.AdderSubtractorSynchronizedMethod;


//synchronized methods acquire a lock on the object instance (this)
//Only one thread can hold the object's lock at a time
//All synchronized methods on the same object share the same lock

public class Example {

    synchronized void add(){
        System.out.println("add");
    }

    void multiply() {
        System.out.println("multiply");
    }


    synchronized void subtract(){
        System.out.println("remove");
    }
}
