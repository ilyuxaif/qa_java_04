package Serge_HW6;

public class Person {

    String name;    // имя фамилия
    int age;        // возраст
    String gender;     // пол (м:ж)

    String getName() {
        return (gender.equals("Male") ? "Mr. " : "Mrs. ");
    }
}
