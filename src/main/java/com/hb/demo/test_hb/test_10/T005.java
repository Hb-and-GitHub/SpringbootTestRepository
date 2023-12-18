package com.hb.demo.test_hb.test_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T005 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List list = new ArrayList();
        for(int i = 0;i<nums.length-k+1;i++){
            int max = Integer.MIN_VALUE;
            for(int j = i;j<i+k;j++){
                if(nums[j]>max){
                    max = nums[j];
                }
            }
            list.add(max);
        }
        int size = list.size() ;
        int[] array = new int[size];
        for(int i = 0;i<size;i++){
            array[i] = (int) list.get(i);

        }
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] ints = new T005().maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(ints));

    }
}
