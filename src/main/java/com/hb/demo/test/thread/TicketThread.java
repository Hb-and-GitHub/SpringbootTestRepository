package com.hb.demo.test.thread;

public class TicketThread implements Runnable{

    private   int ticket = 100;
    private   volatile boolean exits = true;

    @Override
    public void run() {
        while(exits){
            try {
                getTicket();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    public synchronized void getTicket() throws InterruptedException {
        if(ticket>0){
            // Thread.sleep(10);
            System.out.println(Thread.currentThread().getName()+" ---- 第"+ticket+ "张票");
            ticket--;
        }
        else{
            exits = false;
            System.out.println("没票了--_--");
        }
    }

    public static void main(String[] args) {
        new Thread(new TicketThread()).start();
        new Thread(new TicketThread()).start();
        System.out.println("新建线程完成");
    }
}
