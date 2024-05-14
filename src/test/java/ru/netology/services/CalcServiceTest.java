package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcServiceTest {

    @Test
    void shouldCalcThree() {
        CalcService service = new CalcService();

        int income = 10000;     // доход от работы
        int expenses = 3000;    // обязательные месячные траты
        int threshold = 20000;  // траты на отдых
        int expected = 3;        // ожидаемое количество месяцев отдыха

        int actual = service.calculate(income, expenses, threshold);

      Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCalcTwo() {
        CalcService service = new CalcService();

        int income = 100000;    // доход от работы
        int expenses = 60000;   // обязательные месячные траты
        int threshold = 150000; // траты на отдых
        int expected = 2;        // ожидаемое количество месяцев отдыха

        int actual = service.calculate(income, expenses, threshold);


        Assertions.assertEquals(expected, actual);
    }
}



