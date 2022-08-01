package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTests {
    StatsService service = new StatsService();
    public int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18

    };

    @Test
    public void searchSalesAmount() {
        double expectedSalesAmount = 180;
        double actualSalesAmount = service.salesAmount(sales);
        Assertions.assertEquals(expectedSalesAmount, actualSalesAmount);
    }

    @Test
    public void searchAverageSales() {
        double expectedAverageSales = 15;
        double actualAverageSales = service.averageSales(sales);
        Assertions.assertEquals(expectedAverageSales, actualAverageSales);
    }

    @Test
    public void searchMaxMonthSales() {
        int expectedMaxMonthSales = 8;
        int actualMaxMonthSales = service.maxMonthSales(sales);
        Assertions.assertEquals(expectedMaxMonthSales, actualMaxMonthSales);
    }

    @Test
    public void searchMinMonthSales() {
        int expectedMinMonthSales = 9;
        int actualMinMonthSales = service.minMonthSales(sales);
        Assertions.assertEquals(expectedMinMonthSales, actualMinMonthSales);
    }

    @Test
    public void searchMonthOfSalesBeBelowAverage() {
        int expectedMonthOfSalesBelowAverage = 5;
        int actualMonthOfSalesBelowAverage = service.monthOfSalesBeBelowAverage(sales);
        Assertions.assertEquals(expectedMonthOfSalesBelowAverage, actualMonthOfSalesBelowAverage);
    }

    @Test
    public void searchMonthOfSalesBeMoreAverage() {
        int expectedMonthOfSalesBeMoreAverage = 5;
        int actualMonthOfSalesBeMoreAverage = service.monthOfSalesBeMoreAverage(sales);
        Assertions.assertEquals(expectedMonthOfSalesBeMoreAverage, actualMonthOfSalesBeMoreAverage);
    }


}


