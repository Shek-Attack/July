package New;
import java.util.Scanner;
public class L_Shape {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the Row Number: ");

        int num = sc.nextInt();
        int j = 0;
        int i = 0;

        for(i =0; i< num - 1;i++){
            System.out.println("L");
        }
        for(j=0;j<= i;j++) {
            System.out.print("L ");
        }
    }
    }

