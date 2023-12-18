package com.hb.demo.training.train_11;

import java.util.concurrent.*;

public class ThreadTest extends Thread {

    @Override
    public void run(){
        System.out.println("-----继承Thread类创建线程------");
    }

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        threadTest.start();
        System.out.println("-----新建线程输出-------");
    }

}

class RunnableTest implements Runnable{

    @Override
    public void run() {
        System.out.println("-------实现runnable方法创建线程--------");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableTest());
        thread.start();
        System.out.println("------等待新建线程打印-------");
    }
}

class CallableTest implements Callable {

    @Override
    public String  call() throws Exception {
        System.out.println("-----实现callable接口创建线程------");
        return "Finish";
    }

    public static void main(String[] args) {
        FutureTask<String> task = new FutureTask<String>(new CallableTest());
        Thread thread = new Thread(task);
        thread.start();
        String result = null;
        try {
            result = task.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("------新建线程打印情况:"+result);
    }
}

class ThreadPoolTest{
    public static void main(String[] args) {
        int corePoolSize = 5;
        int maximumPoolSize = 10;
        long keepAliveTime = 5000;
        TimeUnit unit = TimeUnit.MILLISECONDS;
        BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<>();
        ThreadFactory threadFactory = Executors.defaultThreadFactory();

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory);
        threadPoolExecutor.submit(() -> System.out.println("-----通过线程池创建线程-----"));
        System.out.println("-----等待新建线程打印-----");
        threadPoolExecutor.shutdown();
    }
}
