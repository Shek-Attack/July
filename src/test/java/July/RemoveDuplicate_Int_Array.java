package July;

import java.util.Arrays;

public class RemoveDuplicate_Int_Array {
    //create function - removeDup
    public static void removeDup(int arr[]){
        Arrays.sort(arr); // sort the array
        int len  = arr.length;
        int j = 0;
        //traverse
        for(int i =0; i<=len-1; i++){
            if(arr[i] != arr[i+1]){
                 arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[ len -1];

        for(int k =0; k <j; k++){
            System.out.println(arr[k] + " ");
        }

    }
    public static void main(String[] args) {
        int arr[] = {5, 1, 2, 6, 4, 4, 5, 6, 8, 7 };

        removeDup(arr);
    }
}
