package com.practise.array;
/*
Maximum Sub array
 */
public class CP_1_MaximumSumSubArray {
    public static void main(String[] args) {
//        int[] arr = new int[]{0,1,2,3};
//          int[] arr = new int[]{-1};
        int[] arr = new int[]{1,-3,2,1,-1};

        System.out.println(bruteforceApproach(arr));
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
