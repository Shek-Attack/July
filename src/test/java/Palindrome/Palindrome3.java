package Palindrome;
/*
          Palindrome or Not Palindrome
 */
public class Palindrome3 {

    public static boolean isPalindrome(char[] word){
        // kayak
        // 01234
       int firstChar = 0; // index number
       int lastChar = word.length -1; // index number
       while (lastChar > firstChar){
           if(word[firstChar] != word[lastChar]){
               return false;
           }
           ++firstChar;
           --lastChar;
       }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
       char[] word = str.toCharArray(); // char array = > [ k a y a k]
        System.out.println(isPalindrome(word));
    }


}
