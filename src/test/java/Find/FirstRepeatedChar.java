package Find;

import java.util.HashSet;

public class FirstRepeatedChar {
    //function
    // plan: 1) hashset; 2)loop 3) condition 4) return/exit
    static char firstRepeated(char str[]){
        HashSet hashSet = new HashSet();
        int len = str.length;

        for(int i=0; i< len -1; i++){
           char c = str[i];

           if(hashSet.contains(c)){
               return c;
           }else{
               hashSet.add(c);
           }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String str = "OceanView";
        char[] arr = str.toCharArray();

        System.out.println(firstRepeated(arr) );
    }
}
