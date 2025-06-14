package Arrays.Easy;

public class ReverseArr {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        Rev(arr);
    }
    static void Rev(int arr[]){
        int start =0;
        int end = arr.length-1;

        while(start < end){
            int temp = arr[start];
          arr [start] =arr[end];
            arr[end] =temp;
            start++;
            end--;
        }
    }

    //helper function is needed in here ok,
    //date 15/06/25
}
