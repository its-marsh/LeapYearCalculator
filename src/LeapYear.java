public class LeapYearCalculator {
    public static boolean isLeapYear (int year) {
        boolean isLeapYear = (year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0);

        if (year < 1 || year > 9999) {
            isLeapYear = false;
        }

        return isLeapYear;
    }
}
