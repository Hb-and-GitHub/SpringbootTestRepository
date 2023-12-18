package com.hb.demo.training.jvm;

public class SynTest {
    final static Object lock = new Object();
    int ticketNum = 10;

    public void getTicket(){
        synchronized (lock){
            if(ticketNum<=0){
                System.out.println("线程"+Thread.currentThread().getName()+"抢票失败,剩余："+ticketNum);
                return;
            }
            System.out.println("线程"+Thread.currentThread().getName()+"抢到1张,剩余："+ticketNum);
            ticketNum--;
        }
    }

    public static void main(String[] args) {
        SynTest synTest = new SynTest();
        for(int i = 0;i<15;i++){
            new Thread(()->{
                synTest.getTicket();
            }).start();
        }
    }
}
