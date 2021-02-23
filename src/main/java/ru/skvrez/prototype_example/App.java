package ru.skvrez.prototype_example;

public class App {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(4.0, 5.0), 45.0, 65.0);
        Rectangle rectangleClone = new Rectangle(rectangle);
        System.out.println(rectangle);
        System.out.println(rectangleClone);
        System.out.println(rectangle.equals(rectangleClone));

        ColoredRectangle coloredRectangle = new ColoredRectangle(new Point(7.0, 5.0), 7.0, 140.0, Color.BLUE);
        ColoredRectangle cloneColoredRectangle = new ColoredRectangle(coloredRectangle);
        System.out.println(coloredRectangle);
        System.out.println(cloneColoredRectangle);
        System.out.println(coloredRectangle.equals(cloneColoredRectangle));
    }
}
