package src;

public class TheNextDay {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public TheNextDay(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static String getNextDay(int day, int month, int year) {
        if (day < 1 || day > 31) {
            return "Data Day not exactly";
        }
        if(month == 4 || month == 6 || month == 9 || month == 11){
            if (day == 30){
                return year + "-" + (month + 1) + "-" + 1;
            }
        }
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8|| month == 10){
            if (day == 31){
                return year + "-" + (month + 1) + "-" + 1;
            }
        }
        if (month == 12) {
            if (day == 31){
                return (year + 1) + "-" + 1 + "-" + 1;
            }
        }
        if (month == 2) {
            if (isLeapyear(year)){
             if (day <= 28){
                 if (day == 28) {
                     return year + "-" + (month + 1) + "-" + 1;
                 }else {
                     return year + "-" + month + "-" + (day+1);
                 }
             }else {
                 return "Data Day not exactly";
             }

            }else {
                if (day <= 29){
                    if (day == 29){
                        return year + "-" + (month + 1) + "-" + 1;
                    }else {
                        return year + "-" + month + "-" + (day+1);
                    }
                }else {
                    return "Data Day not exactly";
                }
            }
        }


        return year + "-" + month + "-" + (day+1);
    }
    private static boolean isLeapyear(int year) {
        boolean isLeapyear = true;
        if (year %4==0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapyear = false;
                }
            }else {
                isLeapyear = false;
            }
        }
        return isLeapyear;
    }
}
