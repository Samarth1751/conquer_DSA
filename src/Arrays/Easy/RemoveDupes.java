package Arrays.Easy;


import java.util.HashSet;

public class RemoveDupes {
    public static void main(String[] args) {
        int arr[] ={1,1,2,2,3,3};
//        int newArr[] ={4,5,9,4,9,2,5,7};
//        int k = Remove(newArr);
//        for(int i =0; i<k;i++){
//            System.out.println(arr[i] +" ");
//        }
        int k = RemoveDupes(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // ise thoda ache se dekhna pdega
    static int RemoveDupes(int arr[]){
        //optimised approach
        int i =0;
        for(int j =1; j< arr.length;j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }

        }
        return i+1;
    }

//hashset approach
    static int Remove(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length;i++){
            set.add(arr[i]);
        }
        int k = set.size();
        int j =0;
        for(int x:set){
            arr[j++] =x;
        }
        return k;
    }



}
