package com.hb.demo.test.streamTest;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;

public class LambdaStreamTest {
    // public static void main(String[] args) {
    //     List<Double> list = Arrays.asList(10.4, 20.5, 33.9, 66.6, 166.7, 999.4);
    //     double sum = list.stream().filter(e -> e > 100.0)
    //             .mapToDouble(e -> e)
    //             .sum();
    //     System.out.println(sum);
    // }

    public static void main(String[] args) {
        IntBinaryOperator sum = (a,b)->a+b;
        int i = sum.applyAsInt(1, 2);
        System.out.println(i);
    }
}
