package Arrays.Medium;

import java.util.Arrays;

public class RotateArrToLeft {
    //same thing as right just little bit diff
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6};
        int k =2;
        RotateArr(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    static void RotateArr(int arr[] , int k){
        int n = arr.length;
        k = k%n;
        Reverse(arr,0,k-1);
        Reverse(arr,k,n-1);
        Reverse(arr,0,n-1);

    }
    private static void Reverse(int arr[] ,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
