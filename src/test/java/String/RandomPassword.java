package String;

import java.security.SecureRandom;

public class RandomPassword {
    public static String randomPassword(int len){

       final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i< len; i++){ // len = 5; iterate 5 times
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        int len = 5;
        System.out.println("randomPassword(len) = " + randomPassword(len));
    }
}
