package homework;/*
Дана строка:
        String s = “Перевыборы выбранного президента”;
        необходимо подсчитать количество букв “е” в строке.
        Для указанной строки ответ будет 4.
*/

public class hw06_02 {
    public static void main(String[] args) {
        String s = "Перевыборы выбранного президента";
        int counter = 0;
        for (char c: s.toCharArray()) {
            if (c == 'е') {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
