package HW7_2;

public class MonthUtils {

    private static Month[] YEAR = {
            new Month("Jan", 31, 16),
            new Month("Feb", 28, 19),
            new Month("Mar", 31, 22),
            new Month("Apr", 30, 21),
            new Month("May", 31, 18),
            new Month("Jun", 30, 21),
            new Month("Jul", 31, 21),
            new Month("Aug", 31, 23),
            new Month("Sep", 30, 22),
            new Month("Oct", 31, 21),
            new Month("Nov", 30, 21),
            new Month("Dec", 31, 22),
    };

    public static Month getMonth(int index) {
        return YEAR[index];
    }

    public static int getMonthsSize() {
        return YEAR.length;
    }

    public static Month[] getYEAR() {
        return YEAR;
    }
}
