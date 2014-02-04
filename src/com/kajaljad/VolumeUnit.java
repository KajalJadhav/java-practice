package com.kajaljad;

public enum VolumeUnit implements Unit {
    LITER(1), MILLILITER(1000), KILOLITER(0.001), GALLONS(0.264);
    private final double value;

    VolumeUnit(double value) {
        this.value = value;
    }

    public double getUnitValue() {
        return value;
    }
}
