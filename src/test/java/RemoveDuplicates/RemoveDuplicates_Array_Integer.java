package RemoveDuplicates;

import javax.swing.plaf.SpinnerUI;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates_Array_Integer {
    /*
     Remove Duplicates From a List Using Plain Java
      arr = {1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8}

     Thinking:   Set (no duplicates) - hashset; ArrayList
     Plan:
     1) Create Arraylist  - done
     2) turn it into hashset - DONE
     3) new arraylist (result - no duplicates) - done
     4) print - done
     */
    public static void main(String[] args) {
        ArrayList<Integer>  list =  new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
//        list.add(1);
//        list.add(2);
        //list.addAll(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
        System.out.println("Orignial list: " + list);

        HashSet hashSet = new HashSet(list);

        ArrayList<Integer>  list2 =  new ArrayList<>(hashSet);

        System.out.println("Result: " + list2);

        System.out.println("========================================");

        ArrayList<Integer>  list3 =  new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
        List<Integer> non_Duplicate = list3.stream().distinct().collect(Collectors.toList());

        System.out.println("New method with Stream: " + non_Duplicate);



    }



}
