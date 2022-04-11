package homework;

public class hw02 {
    public static void main(String[] args) {
        int a = 17;
        int b = 8;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (1.0 * a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("Число a " + (a % 2 == 0 ? "четное" : "нечетное"));
        System.out.println("Число b " + (b % 2 == 0 ? "четное" : "нечетное"));
    }
}
