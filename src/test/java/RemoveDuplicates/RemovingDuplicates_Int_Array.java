package RemoveDuplicates;

import java.util.Arrays;
/*
     Remove Duplicates from int arr[] = {5,1,2,6,4,4,5,6,8,7}
      Plan:
       1) compare two adjacent number
       2) sort (array)
       3)loop
       4) condition : if two numbers are the same
       5) put the new list into to storage - unique
       6) print
 */
public class RemovingDuplicates_Int_Array {
    // create a function that removes duplicates
    public static void non_dup(int arr[]){
        Arrays.sort(arr);
        int len = arr.length;
        int j = 0; // index

        for( int i =0; i <len -1; i++){
            if(arr[i] != arr[ i + 1]){
                  arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[len -1];
        for (int k = 0; k < j; k ++){
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,1,2,6,4,4,5,6,8,7};
        non_dup(arr);
    }
}



