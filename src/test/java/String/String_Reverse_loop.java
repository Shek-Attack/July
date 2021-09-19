package String;
/*
     writing a method that returns a reverse String
     Plan: 1) looping  2) creating empty string
 */
public class String_Reverse_loop {
     public static String reverse(String str){
         String empty = "";
         int len = str.length();

         for(int i=len -1; i >=0; i--){
           empty +=  str.toCharArray()[i];
         }
         return empty;
     }
    public static void main(String[] args) {
        String str = "java";
        System.out.println(reverse(str));
    }
}
