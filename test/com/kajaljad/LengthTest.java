package com.kajaljad;

import junit.framework.Assert;
import org.junit.Test;

public class LengthTest {
    @Test
    public void testGetUnit() {
        Length length = new Length(2, LengthUnit.CENTIMETER);

        Assert.assertEquals(LengthUnit.CENTIMETER, length.getUnit());
        Assert.assertEquals(2.0, length.getValue());
    }

    @Test
    public void testGetValue() {
        Length length = new Length(2, LengthUnit.METER);

        Assert.assertEquals(LengthUnit.METER, length.getUnit());
        Assert.assertEquals(2.0, length.getValue());
    }

    @Test
    public void testConvertsCentiMeterToMeter() {
        Length length = new Length(6.4, LengthUnit.CENTIMETER);
        Length actual = length.convertTo(LengthUnit.METER);
        Length expected = new Length(0.064,LengthUnit.METER);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConvertsMeterToMilliMeter() {
        Length length = new Length(6.4, LengthUnit.METER);
        Length actual = length.convertTo(LengthUnit.MILLIMETER);
        Length expected = new Length(6400,LengthUnit.METER);

        Assert.assertEquals(length, actual);
    }

    @Test
    public void testForEqualsOfCentiMeterAndMeter() {
        Length length = new Length(6.4, LengthUnit.CENTIMETER);
        Length actual = length.convertTo(LengthUnit.METER);
        Length expected = new Length(.064,LengthUnit.METER);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testForEqualsOfKilometerAndMeter() {
        Length length = new Length(6.4, LengthUnit.KILOMETER);
        Length actual = length.convertTo(LengthUnit.METER);
        Length expected = new Length(6400,LengthUnit.METER);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testForEqualsOfInchAndMeter() {
        Length length = new Length(6.4, LengthUnit.METER);
        Length actual = length.convertTo(LengthUnit.INCH);
        Length expected = new Length(251.968503937,LengthUnit.INCH);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testForEqualsOfMeterToYard() {
        Length length = new Length(3.3, LengthUnit.YARD);
        Length actual = length.convertTo(LengthUnit.INCH);
        Length expected = new Length(118.8,LengthUnit.INCH);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testForEqualsOfMeterToFeet() {
        Length length = new Length(3.3, LengthUnit.METER);
        Length actual = length.convertTo(LengthUnit.FEET);
        Length expected = new Length(10.826771654,LengthUnit.FEET);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testForEqualsOfKiloMeterToMiles() {
        Length length = new Length(3.3, LengthUnit.MILES);
        Length actual = length.convertTo(LengthUnit.METER);
        Length expected = new Length(5310.8352,LengthUnit.METER);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testForEqualsOfKiloMeterToMeterByUsingConvertTo() {
        Length length = new Length(1, LengthUnit.KILOMETER);
        Length actual = length.convertTo(LengthUnit.METER);

        Assert.assertEquals(1000.0, actual.getValue());
    }

    @Test
    public void testForEqualsOfKiloMeterToCentimeterByUsingConvertTo() {
        Length length = new Length(1, LengthUnit.KILOMETER);
        Length actual = length.convertTo(LengthUnit.CENTIMETER);

        Assert.assertEquals(100000.0, actual.getValue());
    }

    @Test
    public void testForEqualsOfKiloMeterToYardsrByUsingConvertTo() {
        Length length = new Length(1, LengthUnit.KILOMETER);
        Length actual = length.convertTo(LengthUnit.YARD);

        Assert.assertEquals(1093.61, actual.getValue());
    }
}

