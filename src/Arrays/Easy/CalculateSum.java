package Arrays.Easy;

public class CalculateSum {
    //Given an arr calculate its sum of all its elements
    public static void main(String[] args) {
        int arr[] ={1,2,3,4};
        System.out.println(AllSum(arr));
    }
    static int AllSum(int arr[]){
        int sum =0;
        for(int i =0; i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
}
