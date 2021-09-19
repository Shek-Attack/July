package Find;

import java.util.HashSet;

public class FindFirstRepeatedChar {
 // function
        static char findFirstRepeated(char str[]){

            HashSet hashSet = new HashSet();
            int len = str.length;

            for(int i=0; i<len -1; i++){
                char c =str[i];
                if(hashSet.contains(c)){
                    return c;
                }else{
                    hashSet.add(c);
                }
            }
            return '\0';
        }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
       char[] arr =  str.toCharArray();

        System.out.println(findFirstRepeated(arr));
    }
}
