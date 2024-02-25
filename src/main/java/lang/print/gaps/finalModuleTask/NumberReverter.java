package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int aValue = number % 10;
        int bValue = (number / 10) % 10;
        int cValue = number / 100;
        System.out.println((aValue * 100) + (bValue * 10) + cValue);
    }
}
