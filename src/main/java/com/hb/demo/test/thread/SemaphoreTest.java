package com.hb.demo.test.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {
    private final Executor executor;
    private final Semaphore semaphore;

    public SemaphoreTest(Executor executor,int bound){
        this.executor = executor;
        this.semaphore = new Semaphore(bound);
    }

    public void submitTask(final Runnable command) throws InterruptedException {
        semaphore.acquire();
        try{
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    try{
                        command.run();
                    }finally
                    {
                        semaphore.release();
                    }
                }
            });
        }catch (RejectedExecutionException e){
            semaphore.release();
        }
    }
}
