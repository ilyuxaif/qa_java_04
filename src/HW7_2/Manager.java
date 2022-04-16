package HW7_2;

import java.rmi.MarshalledObject;

public class Manager extends Employee {

    private int numberOfSubordinates;

    public Manager(String name, int age, char gender, double salary, int numberOfSubordinates) {
        super(name, age, gender, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public double getSalary(Month[] monthArray) {
        double result = 0;
        for (int i = 0; i < monthArray.length; i ++) {
            result += getSalary() * monthArray[i].getWorkDays();
        }
        return result + (result * 0.01 * numberOfSubordinates);
    }
}
