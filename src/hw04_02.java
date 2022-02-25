public class hw04_02 {
    public static void main(String[] args) {
        int max = 10000;
        for (int i = 0; (int)Math.pow(5, i) <= max; i++) {
            System.out.println((int)Math.pow(5, i));
        }
    }
}
