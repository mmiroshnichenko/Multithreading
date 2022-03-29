package main.java.com.mmiroshnichenko.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        Foo foo = new Foo();

        es.execute(new AThread(foo));
        es.execute(new BThread(foo));
        es.execute(new CThread(foo));

        es.shutdown();
    }
}
