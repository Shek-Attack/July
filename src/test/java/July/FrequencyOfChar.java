package July;
/*
Given any String print out how many times each character is found in the String
 */
public class FrequencyOfChar {
    public static void main(String[] args) {
        String str = "Apple";
        str = str.toLowerCase();

        int letterCount = 0;
        int len = str.length();
        String userLetter = "";

        for(int i=0; i<len; i++){
            letterCount =0;
            if(userLetter.contains(str.charAt(i) + ""))
                continue;
                 userLetter += str.charAt(i);

            for(int j=0; j<len; j++){
                if(str.charAt(i) == str.charAt(j)){
                    letterCount ++;
                }
            }
            System.out.println(str.charAt(i) + " = " + letterCount);
           // userLetter += str.charAt(i);
        }



    }

}
