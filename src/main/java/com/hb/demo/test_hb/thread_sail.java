package com.hb.demo.test_hb;

public class thread_sail {
    public static void main(String[] args) {

        Window window = new Window(new Ticket());
        new Thread(window).start();
        new Thread(window).start();
        new Thread(window).start();
        new Thread(window).start();
    }
}

    class Ticket {

        private int count = 100;

        void saleTicket() {
            while (true) {
                synchronized (this) {
                    if (count <= 0) {
                        break;
                    }
                    System.out.println(Thread.currentThread().getName() + " 剩余票数" + --count);
                    try {
                        notifyAll();
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    class Window implements Runnable {

        private final Ticket ticket;

        public Window(Ticket ticket) {
            this.ticket = ticket;
        }

        @Override
        public void run() {
            ticket.saleTicket();
        }
    }


