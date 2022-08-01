package ru.netology.stats;


public class StatsService {
    public double salesAmount(int[] sales) {
        double amount = 0;

        for (double i = 0; i < sales.length; i++) {
            amount = amount + sales[(int) i];
        }
        return amount;
    }

    ;

    public double averageSales(int[] sales) {
        double average = 0;
        double amount = 0;
        for (int i = 0; i < sales.length; i++) {
            amount = amount + sales[(int) i];
            average = amount / sales.length;
        }
        return average;
    }

    public int maxMonthSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minMonthSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthOfSalesBeBelowAverage(int[] sales) {

        double average = averageSales(sales);
        int minSales = 0;
        for (int sale : sales) {
            if (sale < average) {
                minSales++;
            }
        }
        return minSales;
    }

    public int monthOfSalesBeMoreAverage(int[] sales) {
        double average = averageSales(sales);
        int maxSales = 0;
        for (int sale : sales) {

            if (sale > average) {
                maxSales++;
            }
        }
        return maxSales;
    }
}



