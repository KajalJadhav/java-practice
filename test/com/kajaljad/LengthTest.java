package com.kajaljad;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LengthTest {
    @Test
    public void testLengthInCentimeter() {
        Length length = new Length(2, new Centimeter());
        assertEquals(2d, length.getValue());
        assertEquals(new Centimeter(), length.getUnit());
    }

    @Test
    public void testLengthInMeter() {
        Length length = new Length(200, new Meter());
        assertEquals(200d, length.getValue());
    }

    @Test
    public void forConversionOfMeterToCentimeter() {
        Length meter = new Length(2, new Meter());
        Length centimeter = meter.convertTo(new Centimeter());
        assertEquals(meter, centimeter);
    }

    @Test
    public void forConversionOfCentimeterToMillimeter() {
        Length centimeter = new Length(10, new Centimeter());
        Length millimeter = centimeter.convertTo(new Millimeter());
        assertEquals(millimeter, centimeter);
    }

    @Test
    public void forConversionOfYardsToMillimeter() {
        Length yard = new Length(2, new Yard());
        Length millimeter = yard.convertTo(new Millimeter());
        assertEquals(millimeter, yard);
    }

    @Test
    public void forConversionOfMilesToMillimeter() {
        Length miles = new Length(2, new Miles());
        Length millimeter = miles.convertTo(new Millimeter());
        assertEquals(millimeter, miles);
    }

    @Test
    public void forConversionOfFeetToMillimeter() {
        Length feet = new Length(2, new Feet());
        Length millimeter = feet.convertTo(new Millimeter());
        assertEquals(millimeter, feet);
    }

    @Test
    public void forConversionOfInchToMillimeter() {
        Length inch = new Length(2, new Inch());
        Length millimeter = inch.convertTo(new Millimeter());
        assertEquals(millimeter, inch);
    }

    @Test
    public void forConversionOfKMToMillimeter() {
        Length km = new Length(2, new Kilometer());
        Length millimeter = km.convertTo(new Millimeter());
        assertEquals(millimeter, km);
    }

    @Test
    public void forConversionOfKMToCm() {
        Length km = new Length(2, new Kilometer());
        Length centimeter = km.convertTo(new Centimeter());
        assertEquals(centimeter, km);
    }

    @Test
    public void forConversionOfKMToYard() {
        Length km = new Length(2, new Kilometer());
        Length yard = km.convertTo(new Yard());
        assertEquals(yard, km);
    }

    @Test
    public void forConversionOfKMToMiles() {
        Length km = new Length(5, new Kilometer());
        Length miles = km.convertTo(new Miles());
        assertEquals(miles, km);
    }

    @Test
    public void forConversionOfInchToKm() {
        Length inch = new Length(1, new Inch());
        Length km = inch.convertTo(new Kilometer());
        assertEquals(km,inch);
    }

}
