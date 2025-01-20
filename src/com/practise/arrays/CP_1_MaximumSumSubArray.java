package com.practise.arrays;
/*
Maximum Sub array
 */
public class CP_1_MaximumSumSubArray {
    public static void main(String[] args) {
//        int[] arr = new int[]{0,1,2,3};
//          int[] arr = new int[]{-1};
        int[] arr = new int[]{1,-3,2,1,-1};

        System.out.println(bruteforceApproach(arr));
        System.out.println(kadaneAlgorithm(arr));
    }

    private static int kadaneAlgorithm(int[] arr){
        int max_global = arr[0];
        int max_current = arr[0];

        for(int i=1;i<arr.length;i++){
            max_current = Math.max(arr[i], max_current+arr[i]);
            if(max_global<max_current)
                max_global = max_current;
        }
        return max_global;
    }

    private static int bruteforceApproach(int[] arr) {
        int max = arr[0];
        for (int i=0;i< arr.length;i++){
            int subMax = 0;
            for (int j=i;j< arr.length;j++){
                subMax = subMax + arr[j];
                if(max<subMax)
                    max = subMax;
            }
        }
        return max;
    }
}
