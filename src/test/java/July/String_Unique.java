package July;

/*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";
            str.split("")
     */
public class String_Unique {

    public String unique(String str){
        String[] arr = str.split("");
        String unique1  ="";

        for(int i=0; i<arr.length; i++) {
            int num = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i].equals(arr[j])){
                    num ++;
                }
            }
            if(num == 1){
                unique1 += arr[i];
            }
        }
        return unique1;
    }
}
