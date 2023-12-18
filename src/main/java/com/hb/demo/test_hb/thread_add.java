package com.hb.demo.test_hb;

public class thread_add {
    public static void main(String[] args) {
        Job1 job1 = new Job1();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(job1);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(job1.sum);

    }
}


class Job1 implements Runnable {

        private int count = 1;
        int sum = 0;

        @Override
        public void run() {
            synchronized (this) {
                for (int i = count; i < count + 10; i++) {
                    sum += i;
                }
                count += 10;
            }
        }
    }
