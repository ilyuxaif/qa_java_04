package HW6;

public class Employee extends Person {

    private int salary;     // зарплата

    public Employee(String name, int age, String gender, int salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //    boolean isSameName(Employee employee) {
//        return person.name.equals(employee.person.name);
//    }
}
