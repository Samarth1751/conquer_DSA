package Arrays.Easy;

public class CountOcc {
    public static void main(String[] args) {
        int arr[] ={1,3,2,2,4,2};
        int target = 2;
        System.out.println(countOcc(arr,target));
    }
    static int countOcc(int arr[],int target){
        int count =0;
        for(int i =0; i<arr.length;i++){
            if(arr[i] == target){
                count++;
            }
        }
        return count;
    }
}
