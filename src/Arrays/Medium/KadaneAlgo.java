package Arrays.Medium;

public class KadaneAlgo {
    public static void main(String[] args) {
    int arr[] ={2, 3, -8, 7, -1, 2, 3};
        System.out.println(Kadane(arr));
    }
    static int Kadane (int arr[]){
        int maxSum = arr[0]; //giving maxSum == 1st ele

        int currSum =arr[0]; //same as MaxSum
        for(int i=1;i<arr.length;i++){ //Starting from index1 till
            currSum =Math.max(arr[i] ,currSum+arr[i]); // updating currSum and check if arr[i] >currSum+arr[i]
            maxSum =Math.max(maxSum,currSum);  //at last check if maxsum > currSum
        }
        return maxSum; //return MaxSum
    }
}
