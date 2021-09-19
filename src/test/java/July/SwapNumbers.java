package July;

public class SwapNumbers {
    public static void main(String[] args) {
        swap(4,7);
    }
    public static void swap(int a, int b) {
        System.out.println("Before swap:" + a + ", " + b);

        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swap:" + a + ", " + b);
    }
}
