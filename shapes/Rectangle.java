package shapes;

public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle(
            String color,
            boolean filled,
            double width,
            double length
    ) {

        super(color, filled);

        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {

        return width * length;
    }

    @Override
    public double getPerimeter() {

        return (width + length) * 2;
    }

    public double getWidth() {

        return width;
    }

    public double getLength() {

        return length;
    }

    @Override
    public String toString() {

        return String.format(
                "[ Rectangle ]\n%s\nWidth : %.1f\nLength: %.1f\nArea      : %.2f\nPerimeter : %.2f",
                super.toString(),
                width,
                length,
                getArea(),
                getPerimeter()
        );
    }
}
