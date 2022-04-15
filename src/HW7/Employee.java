package HW7;

/**
 * Необходимо создать класс Employee со следующими методами:
 * getBaseSalary - получить базовую ставку
 * set Base Salary
 * getName - получить имя
 * setName
 * getSalary - получить зарплату
 */

public class Employee {

    protected int baseSalary;
    private int salary;
    private String name;

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int getSalary() {
        return salary;
    }

}
