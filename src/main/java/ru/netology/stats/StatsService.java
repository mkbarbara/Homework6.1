package ru.netology.stats;

public class StatsService {
    public int getTotalAmount(long[] sales) {
        int totalAmount = 0;
        for (long sale : sales) {
            totalAmount += sale;
        }
        return totalAmount;
    }

    public int getAverageAmount(long[] sales) {
        return getTotalAmount(sales) / sales.length;
    }

    public int getMaxMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i += 1) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i += 1) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getMonthsBelowAverage(long[] sales) {
        int numberMonths = 0;
        for (long sale : sales) {
            if (sale < getAverageAmount(sales)) {
                numberMonths += 1;
            }
        }
        return numberMonths;
    }

    public int getMonthsAboveAverage(long[] sales) {
        int numberMonths = 0;
        for (long sale : sales) {
            if (sale > getAverageAmount(sales)) {
                numberMonths += 1;
            }
        }
        return numberMonths;
    }
}
