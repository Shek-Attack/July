package July;
/*
    Write a function that can find the maximum number from an int Array
     */
public class findMix {

    public int findMin(int[] num){

        int min = Integer.MAX_VALUE;

        for(int each: num){
            if(each < min){
                min = each;
            }
        }
        return min;
    }
}
