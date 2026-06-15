package shapes;

public class Circle extends Shape {

    private double radius;

    public Circle(
            String color,
            boolean filled,
            double radius
    ) {

        super(color, filled);

        this.radius = radius;
    }

    @Override
    public double getArea() {

        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {

        return 2 * Math.PI * radius;
    }

    public double getRadius() {

        return radius;
    }

    @Override
    public String toString() {

        return String.format(
                "[ Circle ]\n%s\nRadius: %.1f\nArea         : %.2f\nCircumference: %.2f",
                super.toString(),
                radius,
                getArea(),
                getPerimeter()
        );
    }
}
