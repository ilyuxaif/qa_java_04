/*
Дана строка:
        String s = “Посмотрите как Рите нравится ритм”;
        необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
        Для указанной строки ответ будет 6, 15, 29.
*/

public class hw06_03 {
    public static void main(String[] args) {
        String s = "Посмотрите как Рите нравится ритм";

        for (int i = 0; i < s.length() - 3; i++) {
            if (s.toLowerCase().substring(i, i + 3).equals("рит")) {
                System.out.println(i);
            }
        }
    }
}
