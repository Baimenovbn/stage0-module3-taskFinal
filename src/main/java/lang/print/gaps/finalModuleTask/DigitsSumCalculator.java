package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int first = number / 1000;
        int second = (number / 100) % 10;
        int third = number / 10 % 10;
        int last = number % 10;

        System.out.println(last + third + second + first);

    }
}
