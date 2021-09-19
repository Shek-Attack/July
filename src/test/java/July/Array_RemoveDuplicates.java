package July;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
   Write a function that can remove the duplicates from an array of integers
    */
public class Array_RemoveDuplicates {
    //solution 1
    public int[] removeDuplicate(int[] arr){
        return Arrays.stream(arr).distinct().toArray();

    }
    //solution 2
    public static int[] removeDuplicate2(int[] array){
        ArrayList<Integer> list =  new ArrayList<>();
        for(int each: array){
            if(!list.contains(each)){
                list.add(each);  // new list of array
            }
        }
        array = new int[list.size()]; // defining new list
        for(int i =0; i<=list.size(); i++){  // looping new list
            array[i] = list.get(i);
        }
        return array;
    }
}
