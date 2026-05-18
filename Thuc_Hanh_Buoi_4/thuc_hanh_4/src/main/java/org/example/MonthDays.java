package org.example;

public class MonthDays {

    public static int getDays(int month, int year) {

        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month");
        }

        switch (month) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            case 2:

                if ((year % 400 == 0) ||
                        (year % 4 == 0 && year % 100 != 0)) {

                    return 29;
                }

                return 28;

            default:
                return -1;
        }
    }
}