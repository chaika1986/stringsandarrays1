package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        System.out.println(service.salesAmount(sales));
        System.out.println(service.averageSales(sales));
        System.out.println(service.maxMonthSales(sales));
        System.out.println(service.minMonthSales(sales));
        System.out.println(service.monthOfSalesBeBelowAverage(sales));
        System.out.println(service.monthOfSalesBeMoreAverage(sales));


    }
}
