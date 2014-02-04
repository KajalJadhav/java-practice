package com.kajaljad.shapes;

import com.kajaljad.shapes.Rectangle;

public class Square {
    Rectangle square;

    public Square(int side) {
        this.square = Rectangle.createRectangle(side, side);
    }

    public int getArea() {
        return square.getArea();
    }

    public int getPerimeter() {
        return square.getPerimeter();
    }

}
