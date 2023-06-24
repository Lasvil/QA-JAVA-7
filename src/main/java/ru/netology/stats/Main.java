package ru.netology.stats;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();

        int allAmountMonth = service.allAmount(arr);
        System.out.println("Сумма всех продаж - " + allAmountMonth);

        int middleSMonth = service.middleSum(arr);
        System.out.println("Средняя сумма продаж в месяц - " + middleSMonth);

        int maxSales = service.maxSales(arr);
        System.out.println("Последний месяц с максимальными продажами - " + maxSales);

        int minSales = service.minSales(arr);
        System.out.println("Последний месяц с минимальными продажами - " + minSales);

        int quantityMonthBellowMiddle = service.quanMonthBellowMiddle(arr);
        System.out.println("Количество месяцев с продажами ниже среднего - " + quantityMonthBellowMiddle);

        int quantityMonthHigherMiddle = service.quanMonthHigherMiddle(arr);
        System.out.println("Количество месяцев с продажами выше среднего - " + quantityMonthHigherMiddle);
    }
}