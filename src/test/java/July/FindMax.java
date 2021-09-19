package July;
/*
        Write a function that can find the maximum number from an int Array
     */
public class FindMax {

    public int findMax(int[] num){
        int max = Integer.MIN_VALUE;

        for(int each: num){
            if(each>max){
                max = each;
            }
        }
        return max;
    }
}
