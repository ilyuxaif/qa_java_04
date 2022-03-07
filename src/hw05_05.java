/*
Задача №5

        Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести сумму элементов массива.
*/



public class hw05_05 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int sum = 0;

        for (int[] ints : array) {
            for (int anInt : ints) {
                sum = sum + anInt;
            }
        }
        System.out.println(sum);
    }
}
