package com.hb.demo.training.train_11;

import java.util.Collections;
import java.util.PriorityQueue;

public class T001 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queueReverse = new PriorityQueue<>((a,b)->(b-a));
        PriorityQueue<Integer> queueNormal = new PriorityQueue<>();
        queueReverse.add(5);
        queueReverse.add(3);
        queueReverse.add(4);
        queueNormal.add(5);
        queueNormal.add(3);
        queueNormal.add(4);
        System.out.println("第一个元素："+queueNormal.poll());
        System.out.println("第二个元素："+queueNormal.poll());
        System.out.println("第三个元素："+queueNormal.poll());
        System.out.println("---------------加入倒序排序方式后----------------");
        System.out.println("第一个元素："+queueReverse.poll());
        System.out.println("第二个元素："+queueReverse.poll());
        System.out.println("第三个元素："+queueReverse.poll());
        System.err.print("www");
    }
}
