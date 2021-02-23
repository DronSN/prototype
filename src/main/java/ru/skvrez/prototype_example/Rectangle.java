package ru.skvrez.prototype_example;

public class Rectangle {

    private Point upperLeftCorner;
    private double width;
    private double height;

    public Rectangle(Point upperLeftCorner, double width, double height) {
        this.upperLeftCorner = upperLeftCorner;
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rectangle) {
        this.upperLeftCorner = rectangle.upperLeftCorner;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "upperLeftCorner=" + upperLeftCorner +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
