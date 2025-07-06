package Arrays.Medium;

import java.util.Arrays;

public class RotateArrayToRight {
    //rotate array by k steps to the right
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7};
        int k =3;
        RotateToRight(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    //o(n) time and o(1) space

    static void RotateToRight(int arr[] , int k){

    int n = arr.length;
    k = k% n;

    reverse(arr,0,n-1);
    reverse(arr,0,k-1);
    reverse(arr,k,n-1);


    }
    private static void reverse(int arr[] ,int start,int end){
        while(start<end){
                int temp =arr[start];
                arr[start] =arr[end];
                arr[end] =temp;
                start++;
                end--;
        }
    }




}
