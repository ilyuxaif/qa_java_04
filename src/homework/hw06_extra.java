package homework;/*
Дан массив:
        String[][] array = {{“Привет”, “всем”, “кто”},
                            {“изучает”, “язык”, “программирования”},
                            {“java”}};
        необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
*/

import java.util.Arrays;

public class hw06_extra {
    public static void main(String[] args) {
        String[][] array = {{"Привет", "всем", "кто"},
                            {"изучает", "язык", "программирования"},
                            {"java"}};
        int counter = 0;
        String[] arrayOutOfE = new String[10];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!(array[i][j].contains("е"))) {
                    counter ++;
                    arrayOutOfE[index] = array[i][j];
                    index++;
                }
            }
        }
        System.out.println(counter);
        System.out.println(Arrays.toString(arrayOutOfE));
    }
}
