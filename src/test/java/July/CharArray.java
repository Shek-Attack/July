package July;

import sun.security.util.Length;

import java.beans.beancontext.BeanContextChild;
import java.util.Arrays;

public class CharArray {

    public static void main(String[] args) {
//We can use for loop to iterate through the values in a character array.
        char[] JavaCharArray = {'b', 'f', 'b', 'a'};
        for (char each : JavaCharArray) {
            System.out.println(each);
        }
        System.out.println("==================");

//We can also iterate it as follows:
        char[] JavaCharArray2 = {'b', 'f', 'b', 'a'};

        for (int i = 0; i < JavaCharArray2.length; i++) {
            System.out.println(JavaCharArray2[i]);
        }
        System.out.println("==================");
//Sorting a Character Array
        char[] JavaCharArray3 = {'b', 'f', 'b', 'a'};
        Arrays.sort(JavaCharArray3);
        System.out.println(JavaCharArray3);
        System.out.println("==================");


    //Length of a Character Array
    char[] JavaCharArray4 = {'b', 'f', 'b', 'a'};
        System.out.println(JavaCharArray4.length);
    }
}
