public class hw05_02 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = array[0];

        for (int n: array) {
            if (n > max) {
                max = n;
            }
        }
        System.out.println(max);
    }
}
