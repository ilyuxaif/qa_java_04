package HW7_1;

/**
 * Необходимо создать класс Employee со следующими методами:
 * getBaseSalary - получить базовую ставку
 * set Base Salary
 * getName - получить имя
 * setName
 * getSalary - получить зарплату
 */

public class Employee {

    private double baseSalary;
    private String name;

    public Employee(double baseSalary, String name) {
        this.baseSalary = baseSalary;
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
