package HW7_1;

public class Main {
    public static void main(String[] args) {

        Worker worker = new Worker(1000, "Sergey");
        Manager manager = new Manager(1000, "Anna", 50);
        Director director = new Director(1000, "Vasya", 20);

        System.out.println(manager.getSalary());
        System.out.println(director.getSalary());
    }
}
