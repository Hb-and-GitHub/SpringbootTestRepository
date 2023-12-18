package com.hb.demo.test_hb;


import javax.swing.tree.TreeNode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public     class T017 {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 222, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        T017 t = new T017();
        int[] num = new int[]{100,4,200,1,3,2};
        t.longestConsecutive(num);
    }
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        Map<Integer,Integer> map = new HashMap<>();
        for(int j = 0;j<nums.length;j++){
            //0,1,2,3 0,0 1,0
            if(!map.containsKey(nums[j])){
                map.put(nums[j],0);
            }
            for(int i = j+1;i<nums.length;i++){

                if(i<nums.length-1 && nums[i+1]-nums[i] == 1){
                    map.put(nums[j],map.get(nums[j])+1);
                }
            }
        }
        int max = 0;
        for(int i : map.values()){
            if(i>max){
                max = i;
            }
        }
        return max;
    }


}
