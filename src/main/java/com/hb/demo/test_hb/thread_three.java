package com.hb.demo.test_hb;

public class thread_three {

    public static void main(String[] args){
        PrintNumber printNumber = new PrintNumber();

        new Thread(() ->{
            for(int i = 0;i<34;i++){
                printNumber.firstThread();
            }
        }).start();

        new Thread(() ->{
            for(int i = 0;i<33;i++){
                printNumber.secondThread();
            }
        }).start();

        new Thread(() ->{
            for(int i = 0;i<34;i++){
                printNumber.thirdThread();
            }
        }).start();
    }
}

class PrintNumber{
    private  int number = 1;
    private int tnum = 1;
    void firstThread(){
        synchronized (this){
            while(tnum!=1){
                try{
                    wait();
                }catch (InterruptedException e){
                    e.printStackTrace();;
                }
            }
            System.out.println(Thread.currentThread().getName()+" "+number);
            number++;
            tnum = 2;
            notifyAll();
        }

    }

    void secondThread(){
        synchronized (this){
            while(tnum!=2){
                try{
                    wait();
                }catch (InterruptedException e){
                    e.printStackTrace();;
                }
            }
            System.out.println(Thread.currentThread().getName()+" "+number);
            number++;
            tnum = 3;
            notifyAll();
        }

    }

    void thirdThread(){
        synchronized (this){
            while(tnum!=3){
                try{
                    wait();
                }catch (InterruptedException e){
                    e.printStackTrace();;
                }
            }
            System.out.println(Thread.currentThread().getName()+" "+number);
            number++;
            tnum = 1;
            notifyAll();
        }

    }
}
