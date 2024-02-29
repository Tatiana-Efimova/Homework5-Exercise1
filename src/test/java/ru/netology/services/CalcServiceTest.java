package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcServiceTest {
    @Test
    public void countOfHolidaysMonthsTest1() {
        CalcService service = new CalcService();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int result = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void countOfHolidaysMonthsTest2() {
        CalcService service = new CalcService();
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int result = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(3, result);
    }
}
