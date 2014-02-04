package com.kajaljad.shapes;

public class Rectangle {
    private int length;
    private int breadth;

    private Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea() {
        return length * breadth;
    }

    public int getPerimeter() {
        return 2 * (length + breadth);
    }

    public static Rectangle createRectangle(int length, int breadth) {
        return new Rectangle(length, breadth);
    }

    public static Rectangle createSquare(int side) {
        return new Rectangle(side, side);
    }
}
