package July;
  /*
     Task: check if a String is palindrome or not
     palindrome: a word, phrase, or sequence that reads the same backward
     as forward, e.g., madam or nurses run, kayak
        String = "Kayak'
        Plan: 1) loop the String
              2) give a condition (comparing first and last chars, and so on)
              3) print
   */
public class Palindrome {
    public static void main(String[] args) {
      String str = "madam";
      int len = str.length(); // int
      boolean check = true;

      for(int i = 0; i < len -1; i++){
        //      0 (first char)                 last char
         if( str.charAt(i) != str.charAt(len - i -1) ){
           check = false;
           break;
         }
      }
      System.out.println(check ? "Palindrome" : "Not Palindrome");
    }
}
