package July;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates_ArrayList {
/*
 Remove Duplicates From a List Using Plain Java
 */
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
//        System.out.println(list);
//
//        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(list);
//
//        ArrayList<Integer> non_Dup = new ArrayList<>(hashSet);
//        System.out.println(non_Dup);

  // method 22222222222 stream
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8,9,10));

        System.out.println(list2);
        List<Integer> non_duplicate = list2.stream().distinct().collect(Collectors.toList());
        System.out.println(non_duplicate);
    }
}
