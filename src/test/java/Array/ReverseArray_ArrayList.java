package Array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ReverseArray_ArrayList {
    //function reverse the elements of the array
    static void reverse(Integer myArray[]){
        Collections.reverse(Arrays.asList(myArray));
        System.out.println("Reverse Array: " + Arrays.asList(myArray));

    }

    public static void main(String[] args) {
        Integer[] myArray = {1,3,5,7,9};
        System.out.println("Original Array: " + Arrays.asList(myArray));
        reverse(myArray);
    }
}
