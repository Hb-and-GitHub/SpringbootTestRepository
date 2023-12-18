package com.hb.demo.test_hb.test_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T002 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue; // 跳过重复元素
            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left-1]) left++; // 跳过重复元素
                    while (left < right && nums[right] == nums[right+1]) right--; // 跳过重复元素
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] sums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(new T002().threeSum(sums));
    }
}
