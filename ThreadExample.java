package com;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread created by extending Thread class");
    }
}

// Implementing Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread created by implementing Runnable interface");
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        // Creating a thread by extending Thread class
        MyThread thread1 = new MyThread();
        thread1.start();

        // Creating a thread by implementing Runnable interface
        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread2.start() //Initiating the execution of the thread
       
    }
}


