package com.kajaljad;

public class Length {
    private double length;
    private Unit unit;

    public Length(double length, Unit unit) {
        this.length = length;
        this.unit = unit;
    }

    public Unit getUnit() {
        return unit;
    }

    public double getValue() {
        return length;
    }

    public Length convertTo(Unit unit){
        double value = ((this.getUnit()).getUnitValue() / unit.getUnitValue()) * this.getValue();
        return new Length(value,unit);
    }

    @Override
    public boolean equals(Object obj) {
        Length length = (Length) obj;
        if(Double.compare(length.convertTo(new Millimeter()).getValue(),this.convertTo(new Millimeter()).getValue()) == 0)    return true;
        return false;
    }
}
