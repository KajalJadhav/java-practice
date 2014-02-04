package com.kajaljad;

import com.kajaljad.shapes.Rectangle;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void forCalculatingRectangleArea() {
        Rectangle rectangle = Rectangle.createRectangle(2, 3);
        int expected = 6;
        int actual = rectangle.getArea();
        assertEquals(expected, actual);
    }

    @Test
    public void forCalculatingPerimeterOfRectangle() {
        Rectangle rectangle = Rectangle.createRectangle(2, 3);
        int expected = 10;
        int actual = rectangle.getPerimeter();
        assertEquals(expected, actual);
    }
}
