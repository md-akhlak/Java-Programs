package JAVA_OOPS;

// using Thread extends
class Thread1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 400) {
            System.out.println("Thread 1 is ruunig");
            i++;
        }
    }

}

class Thread2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 400) {

            System.out.println("Thread 2 is running");
            i++;
        }
    }

}

// using runnale implements
class Imple implements Runnable {
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Akhlak");
        }
    }
}

class Implem implements Runnable {
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Shahnwaz");
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        // Thread1 t1 = new Thread1();
        // // Thread2 t2 = new Thread2();

        // t1.start();
        // // t2.start();

        Imple im1 = new Imple();
        Thread th1 = new Thread(im1);

        Implem tm2 = new Implem();
        Thread th2 = new Thread(tm2);

        th1.start();
        th2.start();

    }
}