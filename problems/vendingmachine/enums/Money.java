package enums;

public enum Money {
    DOLLAR(1),
    QUARTER(0.25);

    private final double value;

    Money(double v) {
        this.value = v;
    }

    public double getValue() {
        return value;
    }
}
