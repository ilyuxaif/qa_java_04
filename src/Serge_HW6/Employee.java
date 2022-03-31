package Serge_HW6;

public class Employee {

    Person person = new Person();
    int salary;     // зарплата

    boolean isSameName(Employee employee) {
        return person.name.equals(employee.person.name);
    }
}
