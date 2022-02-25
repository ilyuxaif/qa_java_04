import java.lang.Math;

public class hw03_03 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * (100 - 0 + 1) + 0);
        System.out.println("a = " + a);
        if (a > 10) {
            System.out.println("a > 10");
        }
        if (a < 100) {
            System.out.println("a < 100");
        }
        if (a / 2 > 20) {
            System.out.println("a / 2 > 20");
        }
        if (a >= 5 && a <= 40) {
            System.out.println("5 <= a <= 40");
        }
        if (a < 5 || a > 40) {
            System.out.println("a < 5 OR a > 40");
        }
    }
}
