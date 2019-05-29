package kz.kassayev.reader.digits;

/**
 * class which calculate amount and average
 * Amount + Average = Amountage
 */
public class Amountage {
    /**
     * show digits which read from file
     */
    public void showDigits(double[] digits) {
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
    }

    /**
     * calculate sum of digits
     *
     * @return get sum
     */
    public double getSum(double[] digits) {
        double sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }
        return sum;
    }

    /**
     * calculate average of digits
     *
     * @return get average
     */
    public double getAvg(double[] digits) {
        double avg;
        avg = getSum(digits) / digits.length;
        return avg;
    }
}
