package MustDoQues;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] ={10, 10, 10};
        System.out.println( SecondLargest(arr));
    }
    static int SecondLargest(int arr[]){
        int max =0;
        int second =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] > max ){
                second =max;
                max = arr[i];
            }
            else if(arr[i] > second && max > arr[i] ){
                second = arr[i];
            }
        }
            return second;
    }
}
