package com.cognizant.forecasting;

public class FinancialForecasting {

    public static double predict(double amount, double rate, int years) {

        if (years == 0)
            return amount;

        return predict(amount * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {

        double futureValue = predict(10000, 0.10, 3);

        System.out.printf("Future Value = %.2f", futureValue);
    }
}