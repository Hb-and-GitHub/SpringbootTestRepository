package com.hb.demo.test_hb;

public class thread_merge {
    public static void main(String[] args) {
        Job job = new Job();
        new Thread(() -> job.printNumber()).start();
        new Thread(() -> job.printChar()).start();

    }

}

class Job {

    private int count = 0;

    void printNumber() {
        for (int i = 0; i < 26; i++) {
            synchronized (this) {
                notify();
                System.out.print(++count);
                System.out.print(++count);
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    void printChar() {
        for (int i = 0; i < 26; i++) {
            synchronized (this) {
                notify();
                System.out.print((char) (65 + i));
                try {
                    if (i == 25) {
                        break;
                    }
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

