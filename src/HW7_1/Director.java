package HW7_1;

public class Director extends Manager {


    public Director(int baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }

    @Override
    public double getSalary () {
        if (getNumberOfSubordinates() == 0) {
            return super.getSalary();
        } else {
            return super.getSalary() * (getNumberOfSubordinates() / 100.0 * 9);
        }
    }
}
