package com.kajaljad;

public class Miles extends Unit {
    private final double miles = 1609344;

    @Override
    public double getUnitValue() {
        return this.miles;
    }
}
