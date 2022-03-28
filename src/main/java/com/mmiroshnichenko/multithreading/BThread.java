package main.java.com.mmiroshnichenko.multithreading;

public class BThread implements Runnable {
    private Foo foo;

    public BThread(Foo foo) {
        this.foo = foo;
        new Thread(this).start();
    }

    @Override
    public void run() {
        foo.second(this);
    }
}
