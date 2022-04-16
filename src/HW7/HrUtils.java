package HW7;

/*Необходимо создать утилитарный класс со следующими методами:
поиск сотрудника в массиве по его имени
поиск сотрудника в массиве по вхождению указанной строки в его имени
подсчет зарплатного бюджета для всех сотрудников в массиве
поиск наименьшей зарплаты в массиве
поиск наибольшей зарплаты в массиве
поиск наименьшего количества подчиненных в массиве менеджеров
поиск наибольшего количества подчиненных в массиве менеджеров
поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров
*/

public class HrUtils {
    /**
     * поиск сотрудника в массиве по его имени
     */
    public static Employee findEmployee(Employee[] employees, String name) {
        return null;
    }

    /**
     * поиск сотрудника в массиве по вхождению указанной строки в его имени
     *
     * @param employees array of employees
     * @param search    part of the name
     * @return found employee
     */
    public static Employee findEmployeeAdvanced(Employee[] employees, String search) {
        //TODO implement me
        return null;
    }

    /**
     * подсчет зарплатного бюджета для всех сотрудников в массиве
     * @param employees array of employees
     * @return бюджет
     */
    public static double calculateBudget(Employee[] employees) {
        double budget = 0.0;
        for (Employee employee: employees) {
            budget = budget + employee.getSalary();
        }
        return budget;
    }

    /** поиск наименьшей зарплаты в массиве
     * @param employees array of employees
     * @return наименьшая зарплата
     */
    public static int findSmallestSalary(Employee[] employees) {
        //TODO implement me
        return 0;
    }

    /** поиск наибольшей зарплаты в массиве
     * @param employees array of employees
     * @return наименьшая зарплата
     *
     */
    public static  int findLargetSalary(Employee[] employees) {
        //TODO implement me
        return 0;
    }

    /** поиск наименьшего количества подчиненных в массиве менеджеров
     *
     *
     */
    public static Manager findManagerLeastSubordinates(Employee[] employees) {
        //TODO implement me
        return null;
    }

    /** поиск наибольшего количества подчиненных в массиве менеджеров
     *
     *
     */
    public static Manager findMostSubordinates(Employee[] employees) {
        //TODO implement me
        return null;
    }

    /** поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
     *
     *
     */
    public static int findLargestBonus(Employee[] employees) {
        //TODO implement me
        return -1;
    }


    /** поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров
     *
     *
     */
    public static int findSmallestBonus(Employee[] employees) {
        //TODO implement me
        return -1;
    }







}
