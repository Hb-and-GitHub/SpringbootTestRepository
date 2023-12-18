package com.hb.demo.test_hb;

import java.util.Scanner;

public class T013 {

    public static int rob(int[] nums) {
//动态规划三步走
//数组元素的含义  dp[i]最高金额
//数组元素的关系   dp[i] = max(dp[i-1] + arr[i],dp[i-2] + arr[i])
//数组元素的初始化   dp[0] = 0; dp[1]=dp[0]+arr[1]
        int len = nums.length;
        if(len <=0){
            return 0;
        }
        int[] dp = new int[len+1];
        dp[0] = 0;
        dp[1]= nums[1];
        for(int i = 2;i<len;i++){
            dp[i] = Math.max(dp[i-1] + nums[i],dp[i-2]+nums[i]);
        }
        return dp[len-1];
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str1 = str.split(",");
        int[] nums = new int[str1.length];
        for(int i = 0;i<str1.length;i++){
            nums[i] = Integer.parseInt(str1[i]);
        }
        System.out.println(rob(nums));
        int i = 5/2;
        System.out.println(i);
    }

}
