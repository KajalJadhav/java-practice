package com.kajaljad;

public abstract class Measurement {
    private double value;
    private Unit unit;

    Measurement(double value, Unit unit) {
        if (value < 0)
            throw new IllegalArgumentException();
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public Unit getUnit() {
        return this.unit;
    }

    public abstract Measurement convertTo(Unit other);

    @Override
    public boolean equals(Object o) {
        Measurement other = (Measurement) o;

        Measurement otherUnit = other.convertTo(this.getUnit());
        return Double.compare(Math.round(this.getValue()), Math.round(otherUnit.getValue())) == 0;
    }
}

