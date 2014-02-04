package com.kajaljad;

import com.kajaljad.shapes.Rectangle;
import com.kajaljad.shapes.Square;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SquareTest {
    @Test
    public void forCalculatingSquareArea() {
        Square square = new Square(3);
        assertEquals(9, square.getArea());
    }

    @Test
    public void forCalculatingPerimeterOfSquare() {
        Square square = new Square(3);
        assertEquals(12, square.getPerimeter());
    }

    @Test
    public void forCalculatingSquareAreaUsingRectangle() {
        Rectangle square = Rectangle.createSquare(3);
        assertEquals(9, square.getArea());
    }
}
