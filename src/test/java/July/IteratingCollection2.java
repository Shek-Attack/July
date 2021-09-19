package July;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/*
    Remove anything above 100: int arr[] = {2,3,4,5,6,7,534}
 */
public class IteratingCollection2 {
    public static void main(String[] args) {

        Collection<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(2,3,4,5,6,7,534));
        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
           Integer each = iterator.next();
            System.out.println(each);
            if (each > 100){
                iterator.remove();
            }
        }
        System.out.println(list);




    }
}
