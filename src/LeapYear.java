public class LeapYear {
    public static boolean isLeapYear (int year) {
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            isLeapYear = (year % 100 != 0);
            if (year % 100 == 0 && year % 400 == 0) {
                isLeapYear = true;
            }
        }

        if (year < 1 || year > 9999) {
            isLeapYear = false;
        }

        return isLeapYear;
    }
}
