package com.kajaljad;

public abstract class Unit {
    public boolean equals(Object o) {
        return o != null && this.getClass() == o.getClass();
    }

    public abstract double getUnitValue();
}
