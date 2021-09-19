package Find;

import java.util.Arrays;
import java.util.HashSet;

/*
int arr[] = {5,1,2,6,4,4,5,6,8,7};
// plan: 0) method; 1) hashset 2) sort 3) loop  - condition 4) index 5)
 */
public class RemoveDuplicate_Array {
    //function
    public static void removeReapted(int arr[]) {

       HashSet hashSet = new HashSet();
       int len = arr.length;

       for(int i=0; i< len -1; i++){
           hashSet.add(arr[i]);
       }
       hashSet.forEach(el -> System.out.println(el));

    }

    public static void main(String[] args) {
        int arr[] = {5,1,2,6,4,4,5,6,8,7};
        removeReapted(arr);


    }
}
