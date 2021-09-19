package July;
/*
1) Remove Duplicate Element in Array using Temporary Array
 */
public class RemovingDuplicates_IntArray {
     //Function to remove duplicate elements
    //This function returns new size of modified array
    public static int removeDuplicates(int arr[], int n){ // n is number is elements
        //Return if array is empty or contains a single element
        if(n == 0 || n == 1)
            return n;
        int[] temp = new int[n];

        //start traversing elements
        int j=0;
        for(int i =0; i<=n - 1; i++)
            //if current element is not equal to next element, then store that current element
            if (arr[i] != arr[i + 1]) // arr[i] = current element
                temp[j++] = arr[i];  // temp[j++] = temp storage

            //store the last element as whether it is unique or repeated, it hasn't stored previously
            temp[j++] = arr[n - 1];

            //Modify original array
            for(int i = 0; i < j; i++)
                arr[i] = temp[i];  // put the Temp <temp[I]> into original array <arr[i]>

                return j;
            }


    public static void main(String[] args) {// int arr[],  n
        int arr[] = {10,20,30,40,50,60,50,50,60,60};
        int length = arr.length;

        length = removeDuplicates(arr,length);

        //print updated array elements
        for(int i=0; i<=length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
