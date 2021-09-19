package July;

public class FirstDuplicateElement {
    /*
    write a program that can find the first duplicated element from the array
     */

    public int firstDuplicate(int[] array){// return is int
        int firstDuplicateElement =  0;

        for(int each: array){
            int frequency = 0;
            for(int each2: array) {
                if (each == each2) {
                    frequency++;
                }
            }
                if(frequency>1){
                    firstDuplicateElement = each;
                    break;
                }
            }
            return firstDuplicateElement;
        }
}
