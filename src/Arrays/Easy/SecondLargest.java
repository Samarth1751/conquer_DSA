package Arrays.Easy;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] ={3,6,2,1,4};
        System.out.println(Second(arr));
    }
    static int Second(int arr[]){
        int first = arr[0];
        int second = Integer.MIN_VALUE;

        for(int i =0; i<arr.length;i++){
            if(arr[i] > first){
                second = first;
                first = arr[i];

            }
            if(arr[i] >second && first > arr[i]){  //ye wali condition ka khyal rkhan
                second = arr[i];
            }

        }
        return second;
    }
}
