package Arrays.Easy;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDupes {
    public static void main(String[] args) {
        int arr[] ={1,1,2,2,3,3};
        int newArr[] ={4,5,9,4,9,2,5,7};
        System.out.println(RemoveDupes(arr));
    }

    // ise thoda ache se dekhna pdega
    static int RemoveDupes(int arr[]){
        int i =0;
        for(int j =1; j< arr.length;j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }

        }
        return i+1;
    }

//    static ArrayList Remove(int newArr[]){
//        HashSet<Integer>seen = new HashSet<>();
//        ArrayList<Integer>list = new ArrayList<>();
////        for(int i=0; )
//    }


}
