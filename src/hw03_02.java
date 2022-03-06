public class hw03_02 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * (1000 - 0 + 1) + 0);
        int b = (int) (Math.random() * (1000 - 0 + 1) + 0);
        System.out.printf("a = %d, b = %d\n", a, b);
        System.out.println(((a + b) % 2 == 0) ? "maybe a and b are even" : "some variable is odd");

    }
}
