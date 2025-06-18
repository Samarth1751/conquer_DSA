package Arrays.Easy;

public class MoveZeroestoEnd {
    public static void main(String[] args) {
        int arr[] ={3,0,1,0,2};
        MoveZero(arr);
        for (int num:arr){
            System.out.println(num + " ");
        }
    }

    //move all zeroes to the end
    static void  MoveZero(int arr[]){
        int count =0;

        for(int i=0; i< arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] =arr[count] ;
                arr[count] = temp;
          count++;
              }
        }
    }

}
