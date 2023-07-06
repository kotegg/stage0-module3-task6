package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        if (numberToBeRounded % 1 >= 0.5) System.out.println((int) numberToBeRounded + 1);
        else System.out.println((int) numberToBeRounded);
    }
}
