package String;
  /*
     Reverse a String
     Ex: "TESLA"  - "ALSET"
     Plan:
     1)Convert String into StringBuilder
     2)use reverse method of StringBuilder
     append = attach

   */
public class Reverse_String {
      public static void main(String[] args) {
          String str = "School";
          // String vs StringBuilder (append; reverse)

          StringBuilder sb = new StringBuilder();
          sb.append(str);
          sb = sb.reverse();

          System.out.println(sb);
      }

}
