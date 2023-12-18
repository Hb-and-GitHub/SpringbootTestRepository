package com.hb.demo.test_hb;

public class threads {

    public static void main(String[] args){
    thread th = new thread();
    new Thread(th).start();
    new Thread(th).start();
    new Thread(th).start();
}

}


class thread implements Runnable{
    int count = 0;

    @Override
    public void run() {
        while(true){
            synchronized (this){
                if(count >= 100){
                    notify();
                    break;
                }
                count++;
                System.out.println(Thread.currentThread().getName()+"  "+count);
                notify();
                try{
                    wait();
                }catch (InterruptedException e){
                    e.printStackTrace();;
                }
            }
        }

    }
}