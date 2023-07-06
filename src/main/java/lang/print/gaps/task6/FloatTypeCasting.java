package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int result = (int) numberToBeRounded;
        if (result % 1 >= 5) System.out.println(result + 1);
        else System.out.println(result);
    }
}
