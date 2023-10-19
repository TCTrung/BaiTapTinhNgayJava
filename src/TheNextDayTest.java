package src;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheNextDayTest {
    @Test
    public void testInputDayNotExactlyWithLessThanMin(){
        int day = 0;
        int month = 1;
        int year = 2023;
        String expected = "Data Day not exactly";
        String actual = TheNextDay.getNextDay(day, month,year);
        assertEquals(expected, actual);
    }

    @Test
    public void testInputDayNotExactlyWithLessThanMax(){
        int day = 32;
        int month = 1;
        int year = 2023;
        String expected = "Data Day not exactly";
        String actual = TheNextDay.getNextDay(day, month,year);
        assertEquals(expected, actual);
    }

    @Test
    public void testInputDayExactly(){
        int day = 12;
        int month = 1;
        int year = 2023;
        String expected = "2023-1-13";
        String actual = TheNextDay.getNextDay(day, month,year);
        assertEquals(expected, actual);
    }

    @Test
    public void test1InputDayExactlyMax30(){
        int day = 30;
        int month = 4;
        int year = 2023;
        String expected = "2023-5-1";
        String actual = TheNextDay.getNextDay(day, month,year);
        assertEquals(expected, actual);
    }

    @Test
    public void test2InputDayExactlyMax30(){
        int day = 30;
        int month = 6;
        int year = 2023;
        String expected = "2023-7-1";
        String actual = TheNextDay.getNextDay(day, month,year);
        assertEquals(expected, actual);
    }

    @Test
    public void test3InputDayExactlyMax30(){
        int day = 23;
        int month = 6;
        int year = 2023;
        String expected = "2023-6-24";
        String actual = TheNextDay.getNextDay(day, month,year);
        assertEquals(expected, actual);
    }


    @Test
    public void test1InputDayExactlyMax31(){
        int day = 31;
        int month = 1;
        int year = 2023;
        String expected = "2023-2-1";
        String actual = TheNextDay.getNextDay(day, month,year);
        assertEquals(expected, actual);
    }

    @Test
    public void test2InputDayExactlyMax31(){
        int day = 31;
        int month = 12;
        int year = 2023;
        String expected = "2024-1-1";
        String actual = TheNextDay.getNextDay(day, month,year);
        assertEquals(expected, actual);
    }

    @Test
    public void test3InputDayExactlyMax31(){
        int day = 11;
        int month = 12;
        int year = 2023;
        String expected = "2023-12-12";
        String actual = TheNextDay.getNextDay(day, month,year);
        assertEquals(expected, actual);
    }

    @Test
    public void test1InputDayMaxOfMonthFebruaryWithCommonYear(){
        int day = 29;
        int month = 2;
        int year = 2023;
        String expected = "Data Day not exactly";
        String actual = TheNextDay.getNextDay(day, month,year);
        assertEquals(expected, actual);
    }

    @Test
    public void test2InputDayMaxOfMonthFebruaryWithCommonYear(){
        int day = 28;
        int month = 2;
        int year = 2023;
        String expected = "2023-3-1";
        String actual = TheNextDay.getNextDay(day, month,year);
        assertEquals(expected, actual);
    }

    @Test
    public void test3InputDayMaxOfMonthFebruaryWithCommonYear(){
        int day = 22;
        int month = 2;
        int year = 2023;
        String expected = "2023-2-23";
        String actual = TheNextDay.getNextDay(day, month,year);
        assertEquals(expected, actual);
    }

    @Test
    public void test1InputDayMinOfMonthFebruaryWithLeapYear(){
        int day = 29;
        int month = 2;
        int year = 2024;
        String expected = "2024-3-1";
        String actual = TheNextDay.getNextDay(day, month,year);
        assertEquals(expected, actual);
    }

    @Test
    public void test2InputDayMinOfMonthFebruaryWithLeapYear(){
        int day = 30;
        int month = 2;
        int year = 2024;
        String expected = "Data Day not exactly";
        String actual = TheNextDay.getNextDay(day, month,year);
        assertEquals(expected, actual);
    }

}
