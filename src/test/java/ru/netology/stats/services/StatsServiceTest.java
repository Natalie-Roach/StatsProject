package ru.netology.stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    //Сумма всех продаж
    public void shouldCalculateSalesAmount() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSalesAmount = 180;
        int actualSalesAmount = service.salesAmount(sales);

        Assertions.assertEquals(expectedSalesAmount, actualSalesAmount);

    }


    @Test
    //Средняя сумма продаж в месяц
    public void shouldCalculateAverageAmountPerMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageAmountPerMonth = 15;
        int actualAverageAmountPerMonth = service.averageAmountPerMonth(sales);

        Assertions.assertEquals(expectedAverageAmountPerMonth, actualAverageAmountPerMonth);

    }

    @Test
    //Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    public void shouldFindMonthNumberWhereMaxSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthNumberMaxSales = 8;
        int actualMonthNumberMaxSales = service.maxSales(sales);

        Assertions.assertEquals(expectedMonthNumberMaxSales, actualMonthNumberMaxSales);
    }

    @Test
    //Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    public void shouldFindMonthNumberWhereMinSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthNumberMinSales = 9;
        int actualMonthNumberMaxSales = service.minSales(sales);

        Assertions.assertEquals(expectedMonthNumberMinSales, actualMonthNumberMaxSales);

    }

    @Test
    //Кол-во месяцев, в которых продажи были ниже среднего
    public void shouldFindMonthsAmountWhenSalesBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthNumberSalesBelowAverage = 5;
        int actualMonthNumberSalesBelowAverage = service.monthsSalesBelowAverage(sales);

        Assertions.assertEquals(expectedMonthNumberSalesBelowAverage, actualMonthNumberSalesBelowAverage);

    }

    @Test
    //Кол-во месяцев, в которых продажи были выше среднего
    public void shouldFindMonthsAmountWhenSalesAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthNumberSalesAboveAverage = 5;
        int actualMonthNumberSalesAboveAverage = service.monthsSalesAboveAverage(sales);

        Assertions.assertEquals(expectedMonthNumberSalesAboveAverage, actualMonthNumberSalesAboveAverage);

    }

}
