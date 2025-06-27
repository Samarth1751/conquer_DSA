package Arrays.Easy;

public class CheckArrEqual {
    public static void main(String[] args) {
        int arr1[] ={1,2,3};
        int arr2[] ={1,7,3};
        System.out.println(Check(arr1,arr2));
    }
    static boolean Check(int arr1[],int arr2[]){
        if(arr1.length != arr2.length){
            return false;
        }
        for(int i =0; i<arr1.length;i++){
           if(arr1[i] != arr2[i] )
           {
               return false;
           }
        }
        return true;
    }
}
