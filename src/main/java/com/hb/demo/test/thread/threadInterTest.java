package com.hb.demo.test.thread;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class threadInterTest implements Runnable{

    private final List<BigInteger> primes = new ArrayList<>();
    private volatile boolean cancel;

    @Override
    public void run() {
        BigInteger one = BigInteger.ONE;
        while(!cancel){
            one = one.nextProbablePrime();
            synchronized (this){
                primes.add(one);
            }
        }

    }

    public void cancel(){
        cancel = true;
    }

    public synchronized List<BigInteger> get(){
        return new ArrayList<BigInteger>(primes);
    }

}

@Slf4j
class testThread{
    List<BigInteger> aSecondOfPrimes() throws InterruptedException{
        threadInterTest threadInterTest = new threadInterTest();
        new Thread(threadInterTest).start();
        threadInterTest.cancel();
        return threadInterTest.get();
    }

    public static void main(String[] args) {
        List<BigInteger> bigIntegers = null;
        try {
              bigIntegers = new testThread().aSecondOfPrimes();
        } catch (InterruptedException e) {
            e.printStackTrace();
            log.error("error");
        }
        System.out.println("main线程执行完毕");
        System.out.println("新建线程执行结果："+bigIntegers);
    }
}

class ReaderThread extends Thread{

    private final Socket socket;
    private final InputStream in;

    public ReaderThread(Socket socket) throws IOException{
        this.socket = socket;
        this.in = socket.getInputStream();
    }

    public void interrupt(){
        try{
            socket.close();
        }catch (IOException e){

        }
        finally {
            super.interrupt();
        }
    }

    public void run(){
        try{
            byte[] bytes = new byte[1];
            while(true){
                int read = in.read(bytes);
                if(read<0){
                    break;
                }
                else if(read>0){
                    System.out.println(bytes);
                }
            }

        }catch (IOException e){

        }
    }

}
