package Java_Fun;
/*

  Plan:
  1) make sure that all are lowercase
  2) loop the string
  3)count the letters
  4) loops for the second time
  5)print
 */
public class FrequencyOfChar {
    public static void main(String[] args) {
        String str = "aaabbbbccccc";
        String usedLetters = "";

        str = str.toLowerCase();
        int countLetters = 0;
        int len = str.length();

        for(int i=0; i<len ; i++){
            countLetters = 0;
            if(usedLetters.contains(str.charAt(i) + "" ))
                continue;
                usedLetters += str.charAt(i);

                for(int k=0; k < len; k++){
                    if(str.charAt(i) == str.charAt(k)){
                        countLetters ++;
            }
        }
                System.out.println(str.charAt(i) + " = " + countLetters);
                //                 s                       1    = s1
                //                  o                      2 =  o2
            }
        }
    }

