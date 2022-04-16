package HW7_2;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Sergey", 30, 'M', 1000);
        Month[] months = {
                new Month("Jan", 31, 16),
                new Month("Feb", 28, 19),
                new Month("Mar", 31, 22)};

        System.out.println(employee1.getSalary(months));

        Manager manager = new Manager("Ivan", 40, 'M', 1000, 10);
        System.out.println(manager.getSalary(months));
    }
}
