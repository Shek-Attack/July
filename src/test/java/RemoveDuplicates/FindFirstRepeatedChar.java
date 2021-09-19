package RemoveDuplicates;

import java.util.HashSet;

/*
         Find the first repeated charm from a string
         String str = "elephant"  -> e
         String str = "javav" -> a
         Plan: 1)  toCharArray 2) create a set ; 3) loop; 4) condition  5) print
         Keywords: loop;call the customize method, toCharArray,
         set (does not have duplicates)
         type: Hashset, linkedHashset, treeSet
 */
public class FindFirstRepeatedChar {
         //function
    static char isFirstRepeated(char arr[]){
        HashSet<Character> h = new HashSet<>(); // no duplicates  a b ccc b v c 

        for(int i =0; i<= arr.length - 1; i++){
               char c = arr[i]; // i = 0 1 2 3 4 5
            if(h.contains(c))
                return c; // break  a
            else
                h.add(c); // a
        }
        return '\0';
    }
    public static void main(String[] args) {
        String str = "teacher";
        char arr[] = str.toCharArray(); // [j , a , v , a , v]
        System.out.println(isFirstRepeated(arr));
    }


}
