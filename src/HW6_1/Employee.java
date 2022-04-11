package HW6_1;

public class Employee {
    String name;
    int age;
    String gender;
    int salary;

    public Employee(String name, int age, String gender, int salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    boolean isSameName(Employee employee) {
        return true;
    }
}
