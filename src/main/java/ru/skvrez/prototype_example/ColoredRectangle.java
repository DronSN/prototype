package ru.skvrez.prototype_example;

public class ColoredRectangle extends Rectangle{

    private Color color;

    public ColoredRectangle(Point upperLeftCorner, double width, double height, Color color) {
        super(upperLeftCorner, width, height);
        this.color = color;
    }

    public ColoredRectangle(ColoredRectangle coloredRectangle) {
        super(coloredRectangle);
        this.color = coloredRectangle.color;
    }

    @Override
    public String toString() {
        return "ColoredRectangle{" +
                "color=" + color +
                '}';
    }
}
