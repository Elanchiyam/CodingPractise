package com.practise.arrays;

public class CP_2_RotateAnArray {
    public static void main(String[] args) {
//        int[] arr = new int[]{1,2,3,4,5,6,7};
        int[] arr = new int[]{-1,-100,3,99};
        int k = 2;
        usingAdditionalMemory(arr,k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void usingAdditionalMemory(int[] arr, int k) {
        int result[] = new int[arr.length];
        k = k % arr.length;
        for (int i= 0; i< k;i++){
            result[i]= arr[arr.length-k+i];
        }
        for (int i = 0; i < arr.length - k; i++) {
            result[k+i] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = result[i];
        }
    }
}
