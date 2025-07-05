package Arrays.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] ={2,7,11,15};
        int x = 18;
        System.out.println(Arrays.toString(TwoSum(arr,x)));

    }

    static int[] TwoSum (int arr[] ,int x){
        //hahsing

        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i =0; i<arr.length;i++){
            int diff = x-arr[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            map.put(arr[i],i);

        }
        return null;
    }
}
