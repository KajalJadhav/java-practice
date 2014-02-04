package com.kajaljad;

public class Length extends Measurement {

    Length(double value, LengthUnit unit) {
        super(value, unit);
    }

    @Override
    public Length convertTo(Unit other) {
        LengthUnit otherLengthUnit = (LengthUnit) other;
        double value = (this.getUnit().getUnitValue() / otherLengthUnit.getUnitValue()) * super.getValue();
        return new Length(value, otherLengthUnit);
    }
}

