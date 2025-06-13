package Arrays.Easy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class TwoSum {
    public static void main(String[] args) {
        int arr[] ={2,4,5,6,7,1};
        int target = 9;
        System.out.println(Arrays.toString(TwoSumBruteForce(arr,target)));
        System.out.println(Arrays.toString( TwoSumHash(arr,target)));
    }
    static int[] TwoSumBruteForce(int []arr,int target){
    // using brute force
        for(int i =0; i < arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    //using hashmap
    static int [] TwoSumHash(int [] arr,int target){
        HashMap<Integer,Integer>map = new HashMap<>();

        for(int i =0; i < arr.length;i++){
            int diff = target - arr[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            map.put(arr[i],i);
        }
    return null;
    }


}
