package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void checkTotal() {
        StatsService service = new StatsService();

        long[] sales = {10000, 4, 1, 0, 35, 700};

        long expected = 10740;
        long actual = service.getTotalAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkAverage() {
        StatsService service = new StatsService();

        long[] sales = {10000, 4, 1, 0, 35, 700};

        long expected = 1790;
        long actual = service.getAverageAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkMin() {
        StatsService service = new StatsService();

        long[] sales = {10000, 4, 1, 0, 35, 700};

        long expected = 4;
        long actual = service.getMinMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkMax() {
        StatsService service = new StatsService();

        long[] sales = {10000, 4, 1, 0, 35, 700};

        long expected = 1;
        long actual = service.getMaxMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkBelow() {
        StatsService service = new StatsService();

        long[] sales = {10000, 4, 1, 0, 35, 700};

        long expected = 5;
        long actual = service.getMonthsBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkAbove() {
        StatsService service = new StatsService();

        long[] sales = {10000, 4, 1, 0, 35, 700};

        long expected = 1;
        long actual = service.getMonthsAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}