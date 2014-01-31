package com.kajaljad;

public class Kilometer extends Unit {
    private final double kilometer = 1000000;

    @Override
    public double getUnitValue() {
        return this.kilometer;
    }
}
