package com.hb.demo.training.train_11;

public class NotifyTest {

    static boolean flag = false;
    static Object lock = new Object();

    public static void main(String[] args) {
        Thread  t1 = new Thread(()->{
            synchronized (lock){
                while(!flag){
                    System.out.println(Thread.currentThread().getName()+".....waiting.....");
                    try{
                        lock.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"....flag is true.....");

            }
        });

        Thread  t2 = new Thread(()->{
            synchronized (lock){
                while(!flag){
                    System.out.println(Thread.currentThread().getName()+".....waiting.....");
                    try{
                        lock.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"....flag is true.....");

            }
        });

        Thread  t3 = new Thread(()->{
            synchronized (lock){
                while(!flag){
                    System.out.println(Thread.currentThread().getName()+".....hold lock.....");
                    lock.notifyAll();
                    flag = true;
                    try{
                        Thread.sleep(20000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"....flag is true.....");

            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
