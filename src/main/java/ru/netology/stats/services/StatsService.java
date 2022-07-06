package ru.netology.stats.services;

public class StatsService {

    //Сумма всех продаж
    public int salesAmount(int[] sales) {
        int amount = 0;

        for (int i = 0; i < sales.length; i++) {
            amount = amount + sales[i];
        }
        return amount;
    }

    //Средняя сумма продаж в месяц
    public int averageAmountPerMonth(int[] sales) {
        int averagePerMonth = salesAmount(sales) / 12;

        return averagePerMonth;
    }

    //Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    public int maxSales(int[] sales) {
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


    //Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    public int minSales(int[] sales) {
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


    //Кол-во месяцев, в которых продажи были ниже среднего
    public int monthsSalesBelowAverage(int[] sales) {
        int monthNumbersLessThanAverage = 0;
        int averagePerMonth = averageAmountPerMonth(sales);
        for (int t : sales) {
            if (t < averagePerMonth) {
                monthNumbersLessThanAverage = monthNumbersLessThanAverage + 1;
            }
        }
        return monthNumbersLessThanAverage;
    }


    //Кол-во месяцев, в которых продажи были выше среднего
    public int monthsSalesAboveAverage(int[] sales) {
        int monthNumbersMoreThanAverage = 0;
        int averagePerMonth = averageAmountPerMonth(sales);
        for (int t : sales) {
            if (t < averagePerMonth) {
                monthNumbersMoreThanAverage = monthNumbersMoreThanAverage + 1;
            }
        }
        return monthNumbersMoreThanAverage;
    }

}
