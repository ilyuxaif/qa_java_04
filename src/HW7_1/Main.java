package HW7_1;

public class Main {
    public static void main(String[] args) {

        Worker worker = new Worker(1000, "Sergey");
        Manager manager = new Manager(1000, "Anna", 50);
        Director director = new Director(1000, "Vasya", 20);

        Worker[] workers = {worker, manager, director};

        System.out.println(HrUtils.totalBudget(workers));

        Manager[] managers = {manager, director};
        String LeastName = HrUtils.findManagerLeastSubordinates(managers).getName();
        System.out.println(LeastName);
        for (Manager guy: managers) {
            if (guy.getName().equals(LeastName)) {
                System.out.println(guy.getNumberOfSubordinates());
            }
        }
    }
}
