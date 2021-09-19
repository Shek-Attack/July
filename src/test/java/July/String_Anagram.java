package July;

import java.util.Arrays;
import java.util.TreeSet;

public class String_Anagram {
    /*
    Write a  function that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true , Solution 1:
                same("abc", "abb"); -> false:

     */
    // solution 1:

    public boolean anagram(String a, String b){  // abc
       char[] ch1 = a.toCharArray();  //  a b c
        char[] ch2 = b.toCharArray();  // c b a

        Arrays.sort(ch1); //  a b c
        Arrays.sort(ch1); //  a b c

        String a1 = "";
        String a2 = "";

        for(char each: ch1){
            a1 += each;  // anything comes out from Each add to emptry string a1
        }

        for(char each: ch2){
            a2 += each;
        }
         return a1.equals(a2);
    }

    // solution 2
    public boolean anagram2(String a, String b){
       a = new TreeSet<String>(Arrays.asList(a.split(""))).toString();
       b = new TreeSet<String>(Arrays.asList(b.split(""))).toString();
           return a.equals(b);

    }

}
