package GeneratePassWord;

public class Strings {
    public static void main(String[] args) {
        String s1 = "Hello ";
        s1 = s1 + "world";
        System.out.println("String : " + s1);

        StringBuilder s2 = new StringBuilder("Hello ");
        s2.append("world");
        s2 = s2.reverse();
        System.out.println("StringBuilder : " + s2);

        StringBuffer s3 = new StringBuffer("Hello ");
        s3.append("world");
        s3 = s3.reverse();
        System.out.println("StringBuffer: " +  s3);
    }
}
