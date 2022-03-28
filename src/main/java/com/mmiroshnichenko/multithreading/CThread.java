package main.java.com.mmiroshnichenko.multithreading;

public class CThread implements Runnable {
    private Foo foo;

    public CThread(Foo foo) {
        this.foo = foo;
        new Thread(this).start();
    }

    @Override
    public void run() {
        foo.third(this);
    }
}
