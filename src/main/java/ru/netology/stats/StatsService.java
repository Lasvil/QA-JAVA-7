package ru.netology.stats;

public class StatsService {
    public int allAmount(int[] amount) {
        int sum = 0;
        for (int i = 0; i < amount.length; i++) {
            sum = sum + amount[i];
        }
        return sum;
    }

    public int middleSum(int[] middle) {
        int sumMiddle = 0;
        for (int i = 0; i < middle.length; i++) {
            sumMiddle = sumMiddle + middle[i];
        }
        sumMiddle = sumMiddle / middle.length;
        return sumMiddle;
    }

    public int maxSales(int[] maxSales) {
        int minMonth = 0;

        for (int i = 0; i < maxSales.length; i++) {
            if (maxSales[i] >= maxSales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int minSales(int[] minSales) {
        int minMonth = 0;

        for (int i = 0; i < minSales.length; i++) {
            if (minSales[i] <= minSales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int quanMonthBellowMiddle(int[] bellowMiddle) {
        int quanMonthB = 0;
        int sumMid = middleSum(bellowMiddle);
        for (int i = 0; i < bellowMiddle.length; i++) {
            if (bellowMiddle[i] < sumMid) {
                quanMonthB = quanMonthB + 1;
            }
        }
        return quanMonthB;
    }

    public int quanMonthHigherMiddle(int[] higherMiddle) {
        int quanMonthH = 0;
        int sumMid = middleSum(higherMiddle);
        for (int i = 0; i < higherMiddle.length; i++) {
            if (higherMiddle[i] > sumMid) {
                quanMonthH = quanMonthH + 1;
            }
        }
        return quanMonthH;
    }
}