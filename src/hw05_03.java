//Задача №3
//
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести минимальное значение массива.


public class hw05_03 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 0, 7, 8, 6};
        int min = array[0];

        for (int n: array) {
            if (n < min) {
                min = n;
            }
        }
        System.out.println(min);
    }
}
