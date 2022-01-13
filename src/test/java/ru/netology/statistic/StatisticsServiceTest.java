package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void shouldFindMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void shouldFindMax1 () {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 2, 5, 8, -10};
        long expected = 8;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}

