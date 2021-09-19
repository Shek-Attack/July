package Find;
/*
Given any String print out how many times each character is found in the String
  String str = "School";
  Plan: 1)lowercase 2) empty string 3) counter 4) loop , condition 5) loop - compare 6)print
 */
public class Frequency {
    public static void main(String[] args) {
        String str = "aabbccvvdddddggggggg";
        str = str.toLowerCase();
        String usedLetters = "";
        int letterCounter = 0;
        int len = str.length();

        for(int i=0; i<len; i++) {
            letterCounter = 0;
            if (usedLetters.contains(str.charAt(i) + ""))
                continue;
            usedLetters += str.charAt(i);

            for (int k = 0; k < len; k++) {
                if (str.charAt(i) == str.charAt(k))
                    letterCounter++;
            }

            System.out.println(str.charAt(i) + " = " + letterCounter);
        }
        }
    }
