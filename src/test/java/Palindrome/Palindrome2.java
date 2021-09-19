package Palindrome;
/*
          Palindrome or Not Palindrome = > True or False
 */
public class Palindrome2 {
      //function
    public static boolean isPalindrome(String str){
        int len = str.length(); // int
        for(int i=0; i < len/2; i++){
            if(str.charAt(i) != str.charAt(len - i - 1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "kayak";
        System.out.println(isPalindrome(str));


    }
}
