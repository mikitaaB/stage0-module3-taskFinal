package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = 0;
        int remainingNumber = number;

        while (remainingNumber > 0) {
            int digit = remainingNumber % 10;
            sum += digit;
            remainingNumber /= 10;
        }

        System.out.println(sum);
    }
}
