package homework;/*
Дана строка:
        String s = “Перестановочный алгоритм быстрого действия”;
        необходимо вывести все буквы “о” из этой строки.
        Для указанной строки ответ будет “ооооо” (или в столбик)
*/

public class hw06_01 {
    public static void main(String[] args) {
        String s = "Перестановочный алгоритм быстрого действия";

        for (char c: s.toCharArray()) {
            if (c == 'о') {
                System.out.println(c);
            }
        }

    }
}
