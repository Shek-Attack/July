package July;
/*
   Write function that can remove the duplicated values from String
           Ex: removeDup("AAABBBCCC") ==> ABC
    */
public class RemoveDuplicates_String {

    public String removeDuplicate(String str){
        String result = "";

        for(int i=0; i<=str.length(); i++){
            if(!result.contains("" + str.charAt(i))){  // add "" to char results String
                result += "" + str.charAt(i);
            }
        }
        return result;
    }
}
