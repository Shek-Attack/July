package Array;

public class Reverse_Array {
    /*public static int[] reverse(int[] arr) {
        //int[] result = new int[arr.length];
        for (int i = 0; i < arr.length/2; i++) {

            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }

     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //print array starting from first element
        System.out.println("Original Array");
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");

            System.out.println();

            //print array starting from last element
            System.out.println("Original Array printed in reverse order: ");
            for(int i= arr.length-1; i>=0; i--)
                System.out.print(arr[i] + " ");


    }
}
