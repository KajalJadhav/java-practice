package com.kajaljad;

import junit.framework.Assert;
import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class VolumeTest {
    @Test
    public void testGetUnit() {
        Volume volume = new Volume(2, VolumeUnit.MILLILITER);

        Assert.assertEquals(VolumeUnit.MILLILITER, volume.getUnit());
        Assert.assertEquals(2.0, volume.getValue());
    }

    @Test
    public void shouldConvertLiterToMilliliterAndCheckingByEquals() {
        Volume volume = new Volume(2, VolumeUnit.LITER);
        Volume actual = new Volume(2000,VolumeUnit.MILLILITER);
        assertEquals(volume, actual);
    }

    @Test
    public void shouldConvertMilliliterToKiloliterAndCheckingByEquals() {
        Volume volume = new Volume(3, VolumeUnit.MILLILITER);
        Volume actual = volume.convertTo(VolumeUnit.KILOLITER);
        Volume expected = new Volume(0.000003,VolumeUnit.KILOLITER);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldConvertMilliliterToGallonAndCheckingByEquals() {
        Volume volume = new Volume(3000, VolumeUnit.MILLILITER);
        Volume actual = volume.convertTo(VolumeUnit.GALLONS);
        Volume expected = new Volume(0.792,VolumeUnit.GALLONS);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldConvertGallonToLiter() {
        Volume volume = new Volume(1, VolumeUnit.GALLONS);
        Volume actual = volume.convertTo(VolumeUnit.LITER);

        Assert.assertEquals(3.78, actual.getValue(), 0.01);
    }
}
