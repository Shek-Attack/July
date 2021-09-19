package RemoveDuplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/*
   Remove anything bigger than 10 : int arr[] = {2,3,4,5,6,7,13,15,534}
   Plan:
   1) collection - ArrayList
   2) Iterator - removing while iterating
   3) condition - remove anything bigger than 10
   4) printing

 */
public class Remove_Iterator {
    public static void main(String[] args) {
        //Collection
        Collection<Integer> list = new ArrayList<>();
        //list.add(2);
        list.addAll(Arrays.asList(2,3,4,5,6,7,13,15,534));

       // System.out.print(list);
        // 2) Iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
          Integer  each   = iterator.next();
            System.out.print(each + " ");

            if(each > 10){
                iterator.remove();
            }
        }
        System.out.println();
        System.out.println(list);
    }

    }