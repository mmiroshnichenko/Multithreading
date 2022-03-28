package main.java.com.mmiroshnichenko.multithreading;

public class AThread implements Runnable {
    private Foo foo;

    public AThread(Foo foo) {
        this.foo = foo;
        new Thread(this).start();
    }

    @Override
    public void run() {
        foo.first(this);
    }
}
