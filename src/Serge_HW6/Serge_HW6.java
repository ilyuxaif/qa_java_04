package Serge_HW6;

public class Serge_HW6 {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.person.name = "Sergey";
        employee1.salary = 20000;

        Employee employee2 = new Employee();
        employee2.person.name = "Anna";
        employee2.salary = 15000;

        Salary salary = new Salary();
        Employee[] workersSalary = {employee1, employee2};
        System.out.println(salary.getSum(workersSalary));

    }
}

