package com.hb.demo.training.algorithm;

public class paramSumAboveSelf {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] leftArr = new int[len];
        leftArr[0] = 1;
        int[] rightArr = new int[len];
        rightArr[len-1] = 1;
        int[] result = new int[len];
        for(int i = 1;i<len;i++){
            leftArr[i] = leftArr[i-1]*(nums[i-1]);
        }
        for(int j = len-2;j>=0;j--){
            rightArr[j] = rightArr[j+1]*(nums[j+1]);
        }
        for(int i = 0;i<len;i++){
            result[i] = leftArr[i]*rightArr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,1,0,-3,3};
        int[] ints = new paramSumAboveSelf().productExceptSelf(nums);
        for(int i : ints){
            System.out.println(i);
        }
    }
}
