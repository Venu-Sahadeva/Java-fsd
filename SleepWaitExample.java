package com;

public class SleepWaitExample {

	public static void main(String[] args) {
		        final Object lock = new Object();

		        // Thread using sleep()
		        Thread sleepThread = new Thread(() -> {
		            synchronized (lock) {
		                System.out.println("Sleep Thread: Going to sleep for 3 seconds");
		                try {
		                    Thread.sleep(3000); // Sleep for 3 seconds
		                } catch (InterruptedException e) {
		                    e.printStackTrace();
		                }
		                System.out.println("Sleep Thread: Waking up after sleep");
		            }
		        });

		        // Thread using wait() and notify()
		        Thread waitThread = new Thread(() -> {
		            synchronized (lock) {
		                System.out.println("Wait Thread: Waiting for notification");
		                try {
		                    lock.wait(); // Waiting for notification
		                } catch (InterruptedException e) {
		                    e.printStackTrace();
		                }
		                System.out.println("Wait Thread: Got notification, continuing execution");
		            }
		        });

		        sleepThread.start();
		        waitThread.start();

		        // Sleep for a short duration to allow the threads to start
		        try {
		            Thread.sleep(500);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }

		        // Notify the waiting thread after a delay
		        synchronized (lock) {
		            lock.notify();
		            System.out.println("Main Thread: Notified the waiting thread");
		        }
		    }
		

	}


