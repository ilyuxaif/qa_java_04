package HW7_1;

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
    public static Worker findWorkerByName(Worker[] workers, String name) {
        for (Worker worker : workers) {
            if (name.equals(worker.getName())) {
                return worker;
            }
        }
        return null;
    }

    /**
     * поиск сотрудника в массиве по вхождению указанной строки в его имени
     *
     * @param workers array of employees
     * @param search    part of the name
     * @return found employee
     */
    public static Worker findWorkerBySubName(Worker[] workers, String search) {
        for (Worker worker : workers) {
            if (worker.getName().contains(search)) {
                return worker;
            }
        }
        return null;
    }

    /**
     * подсчет зарплатного бюджета для всех сотрудников в массиве
     * @param workers array of employees
     * @return бюджет
     */
    public static double totalBudget(Worker[] workers) {
        double budget = 0.0;
        for (Worker worker: workers) {
            budget = budget + worker.getSalary();
        }
        return budget;
    }

    /** поиск наименьшей зарплаты в массиве
     * @param workers array of employees
     * @return наименьшая зарплата
     */
    public static int findSmallestSalary(Worker[] workers) {
        //TODO implement me
        return 0;
    }

    /** поиск наибольшей зарплаты в массиве
     * @param workers array of employees
     * @return наименьшая зарплата
     *
     */
    public static  int findLargestSalary(Worker[] workers) {
        //TODO implement me
        return -1;
    }

    /**
     * поиск наименьшего количества подчиненных в массиве менеджеров
     */
    public static Manager findManagerLeastSubordinates(Manager[] managers) {
        Manager result = managers[0];

        for (int i = 1; i < managers.length; i ++) {
            if (result.getNumberOfSubordinates() > managers[i].getNumberOfSubordinates()) {
                result = managers[i];
            }
        }
        return result;
    }

    /** поиск наибольшего количества подчиненных в массиве менеджеров
     *
     *
     */
    public static Manager findMostSubordinates(Manager[] managers) {
        Manager result = managers[0];

        for (int i = 1; i < managers.length; i ++) {
            if (result.getNumberOfSubordinates() < managers[i].getNumberOfSubordinates()) {
                result = managers[i];
            }
        }
        return result;
    }

    /** поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
     *
     *
     */
    public static double findLargestBonus(Manager[] managers) {
        //TODO implement me
        return -1;
    }


    /** поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров
     *
     *
     */
    public static double findSmallestBonus(Manager[] managers) {
        //TODO implement me
        return -1;
    }







}
