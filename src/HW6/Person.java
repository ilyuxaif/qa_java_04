package HW6;

public class Person {

    String name;    // имя фамилия
    int age;        // возраст
    String gender;     // пол (м:ж)

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
//    public String getName() {
//        return (gender.equals("Male") ? "Mr. " + name : "Mrs. " + name);
//    }
}
