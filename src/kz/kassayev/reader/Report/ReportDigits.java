package kz.kassayev.reader.Report;

import kz.kassayev.reader.digits.Amountage;

public class ReportDigits {
    Amountage amountage = new Amountage();

    public void getResult(double[] numbers) {
        try {
            amountage.showDigits(numbers);
            System.out.println("Average : " + amountage.getAvg(numbers));
            System.out.println("Sum : " + amountage.getSum(numbers));
        } catch (NullPointerException e) {
            System.out.println("methods got null : " + e);
        }
    }
}
