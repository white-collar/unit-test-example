package calculator;

public class Calculator {
    private int argument1;
    private int argument2;

    Calculator(int argument1, int argument2) {
        this.argument1 = argument1;
        this.argument2 = argument2;
    }

    public int getSum() {
        return argument1 + argument2;
    }

    public int getDiff() {
        return argument1 - argument2;
    }
}
