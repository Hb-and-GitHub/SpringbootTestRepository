package com.hb.demo.test_hb.test_10;

public class T010 {

    /**
     * 0 > 3
     * 1 > 4
     * 2 > 5
     * 3 > 6
     * 4 > 0
     * 5 > 1
     * 6 > 2
     * @param nums
     * @param k
     */


        public void rotate(int[] nums, int k) {
            int length = nums.length;
            int[] arr = new int[length];
            for(int i = 0;i<length-k;i++){
                arr[i+k] = nums[i];
            }
            if(k%2==0){
                for(int j = 0;j<=length-k-1;j++){
                    arr[j] = nums[j+k];
                }
            }
            else{
                for(int j = 0;j<=length-k;j++){
                    arr[j] = nums[j+k+1];
                }
            }
            for(int i : arr){
                System.out.print(" " +i);
            }
        }

    public static void main(String[] args) {
        int[] arr = new int[]{-1,-100,3,99};
        int k =2;
        System.out.println("原数组：---");
        for (int i : arr){
            System.out.print(" "+i);
        }
        System.out.println();
        System.out.println("转换后数组：---");
        new T010().rotate(arr,k);
    }

}

//1629055346463248386
//1629055346463248386