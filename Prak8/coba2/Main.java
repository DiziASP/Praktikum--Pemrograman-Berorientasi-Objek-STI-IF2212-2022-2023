package Prak8.coba2;

public class Main {
    static class MyThread extends Thread {
        public void run() {
            SynchronizedCounter sc = new SynchronizedCounter();
            sc.increment();
            System.out.println(sc.value());
        }
    }

    static class MyThread2 extends Thread {
        public void run() {
            SynchronizedCounter sc = new SynchronizedCounter();
            System.out.println(sc.value());
        }
    }

    public static void main(String[] args) {
        (new MyThread()).start();
        (new MyThread2()).start();
    }
}
