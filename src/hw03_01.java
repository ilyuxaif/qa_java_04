import java.lang.Math;

public class hw03_01 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * (1000 - 0 + 1) + 0);
        int b = (int) (Math.random() * (1000 - 0 + 1) + 0);

        System.out.printf("a = %d, b = %d\n", a, b);

        if (a < b) {
            System.out.println("a < b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a == b");
        }
    }
}
