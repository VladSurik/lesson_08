package com.company;

//банк положили S денег. Какой станет сумма вклада через N лет, если процент 1,5% добавляется к сумме вклада ежемесячно.

public class task_01 {

    public static void main(String[] args) {
        double sumDeal = 10000.99;
        int periodDealYears = 8;
        double sumCapital = sumDeal;
        double percent = 1.5;

        for (int i = 0; i < periodDealYears * 12; i++) {
            sumCapital += sumCapital / 100 * percent;
        }
        System.out.printf("your sum %.2f after %s", sumCapital, periodDealYears);
    }
}
