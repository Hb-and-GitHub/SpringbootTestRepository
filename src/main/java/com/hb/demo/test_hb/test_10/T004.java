package com.hb.demo.test_hb.test_10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class T004 {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int [] nums = new int[]{1,-1,0};
        int k = 0;
        System.out.println(new T004().subarraySum(nums, k));
    }
}
