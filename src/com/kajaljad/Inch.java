package com.kajaljad;

public class Inch extends Unit {
    private final double inch = 25.4;

    @Override
    public double getUnitValue() {
        return this.inch;
    }
}
