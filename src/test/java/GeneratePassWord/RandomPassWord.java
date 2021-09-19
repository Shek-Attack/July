package GeneratePassWord;

import java.security.SecureRandom;

public class RandomPassWord {
    //function
    //Method to generate a random alphanumeric password of a specific length
    public static String generateRandomPassword(int len){
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        //each iteration of the loop randomly chooses a character from the given
        //ASCII rang and appends it to the 'StringBuilder' instance
        for(int i=0; i<len; i++){
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int len = 5;
        System.out.println(generateRandomPassword(len));

    }
}
