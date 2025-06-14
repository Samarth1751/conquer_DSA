package Arrays.Easy;

public class LargestEle {
    public static void main(String[] args) {
        int arr[] ={12,14,3,21,5};
        System.out.println(Largest(arr));
    }
    static int Largest(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i =0; i< arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}
