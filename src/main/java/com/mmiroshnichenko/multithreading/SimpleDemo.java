package main.java.com.mmiroshnichenko.multithreading;

public class SimpleDemo {
    public static void main(String[] args) {
        Foo foo = new Foo();
        new AThread(foo);
        new BThread(foo);
        new CThread(foo);
    }
}
