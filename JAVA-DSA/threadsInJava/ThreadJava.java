package threadsInJava;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Runn implements Runnable {

    @Override
    public void run() {
        System.out.println("Running");
    }
}

class Counter {
    public static int count = 0;

    // synchronized
    public synchronized void incremented() {
        count++;
        System.out.println(count);
    }

    public synchronized int get() {
        return count;
    }

    // synchronized blocks
    private Object lock = new Object();

    public void incr() {
        synchronized (lock) {
            count++;
        }
    }

    public int getCnt() {
        synchronized (lock) {
            return count;
        }
    }

    // volatile keywords
    private volatile int value;

    public void setValue(int newvalue) {
        this.value = newvalue;
    }

    public int getValue() {
        return value;
    }

    private Lock lock2 = new ReentrantLock();

    public void increment() {
        ((Lock) lock2).lock();
        try {
            count++;
        } finally {
            ((Lock) lock2).unlock();
        }
    }

    public int getCount() {
        ((Lock) lock2).lock();
        try {
            return count;
        } finally {
            ((Lock) lock2).unlock();
        }
    }
}

public class ThreadJava extends Thread {
    public static int count = 0;

    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("thread is running" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadJava obj = new ThreadJava();
        ThreadJava obj2 = new ThreadJava();

        obj.setPriority(Thread.MAX_PRIORITY);
        obj2.setPriority(Thread.MAX_PRIORITY);

        obj.start();
        obj2.start();

        // Counter counter = new Counter();
        // System.out.println(counter.get());
        // counter.incremented();

    
    

    }
}
