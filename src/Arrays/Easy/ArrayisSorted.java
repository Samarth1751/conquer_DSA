package Arrays.Easy;

public class ArrayisSorted {
    //check if arr is sorted
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        System.out.println(ArraySorted(arr));
    }

    //Notes:
//    okay so run a loop through end after that check if current ele
//    is greater than next element ,if condition satisfies
    // return false,or else return true;
    static boolean ArraySorted(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                return false;
            }

        }
        return true;
    }

}
