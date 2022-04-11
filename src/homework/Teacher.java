package homework;

public class Teacher {
    public static void main(String[] args) {
        String line = "----------------------------------";

        String name = "Мариванна";
        String subject = "Учитель русского языка";
        int age = 25;

        System.out.println(line);
        System.out.println("Карточка учителя:");
        System.out.println("Имя: " + name);
        System.out.println("Должность: " + subject);
        System.out.println("Возраст: " + age);
        System.out.println(line);

        String name1 = "Петрович";
        String subject1 = "Учитель труда";
        int age1 = 49;

        System.out.println("Карточка учителя:");
        System.out.println("Имя: " + name1);
        System.out.println("Должность: " + subject1);
        System.out.println("Возраст: " + age1);
        System.out.println(line);
    }

}
