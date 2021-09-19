package Palindrome;
/*
Given any String determine if it is Palindrome. Print “Palindrome” if it is and “Not Palindrome” if
it is not:  (Anna; Civic, Kayak, Mom, Dad, Noon); if (An = an ; Anna )
Plan:

 */
public class Palindrome1 {

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
