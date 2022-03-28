package main.java.com.mmiroshnichenko.multithreading;

import java.util.concurrent.Semaphore;

public class Foo {
    private final Semaphore firstSemaphore = new Semaphore(1);
    private final Semaphore secondSemaphore = new Semaphore(0);
    private final Semaphore thirdSemaphore = new Semaphore(0);

    public void first(Runnable r) {
        try {
            firstSemaphore.acquire();
            System.out.print("first");
        } catch (InterruptedException e) {
            System.err.println(e);
        } finally {
            secondSemaphore.release();
        }
    }

    public void second(Runnable r) {
        try {
            secondSemaphore.acquire();
            System.out.print("second");
        } catch (InterruptedException e) {
            System.err.println(e);
        } finally {
            thirdSemaphore.release();
        }
    }

    public void third(Runnable r) {
        try {
            thirdSemaphore.acquire();
            System.out.print("third");
        } catch (InterruptedException e) {
            System.err.println(e);
        } finally {
            firstSemaphore.release();
        }
    }
}
