/*
Задача №4

        Дан массив:
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        необходимо вывести среднее арифметическое всех значений массива
*/


public class hw05_04 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        float sum = 0, counter = 0;

        for (int n : array) {
            sum = sum + n;
            counter ++;
        }
        System.out.println(sum/counter);
    }
}
