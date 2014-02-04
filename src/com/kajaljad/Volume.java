package com.kajaljad;

public class Volume extends Measurement {
    Volume(double value, VolumeUnit unit) {
        super(value, unit);
    }

    @Override
    public Volume convertTo(Unit other) {
        VolumeUnit otherVolumeUnit = (VolumeUnit) other;
        double newValue = otherVolumeUnit.getUnitValue() / this.getUnit().getUnitValue() * this.getValue();
        return new Volume(newValue, otherVolumeUnit);
    }
}