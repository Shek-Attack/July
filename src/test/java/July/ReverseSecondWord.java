package July;
/*
    Reverse the second word ONLY
        Ex:
            Input: Str = I Love Java
            OutPut: I evoL Java
            method:String[] words = Str.split;
            loop: loop only second word or word[1].length()-1
            empty string = Reversed =""
                 */
public class ReverseSecondWord {

    public String reverseSecondW(String sentence){
        String[] words= sentence.split(" ");
        String reversed = "";

        for(int i = words[1].length()-1; i>=0; i--){
            reversed += words[1].charAt(i);
        }
       words[1] = reversed;
        String result = "";

        for(String each: words){
            result += each + " ";
        }
        return result.trim();
    }
}
