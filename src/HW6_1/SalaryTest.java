package HW6_1;

public class SalaryTest {

    public static void main(String[] args) {

        Employee[] employees = new Employee[3];

        Employee john = new Employee("John Doe", 37, "Male", 20356);
        Employee jane = new Employee("Jane Doe", 35, "Female", 23506);
        Employee vasya = new Employee("Vasya", 40, "Male", 12356);

        employees[0] = john;
        employees[1] = jane;
        employees[2] = vasya;

        Salary salary = new Salary();
        System.out.println("sum of salaries = " + salary.getSum(employees));
    }
}
