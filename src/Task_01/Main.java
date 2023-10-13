package Task_01;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 5),
                new Triangle(3, 4, 5),
                new Pentagon(4),
                new Trapezoid(3, 5, 4),
                new Ellipse(3, 4)
        };

        for (Shape shape : shapes) {
            System.out.println(shape.shapeName + " area: " + shape.area());
            System.out.println(shape.shapeName + " perimeter: " + shape.perimeter());
            System.out.println();
        }
    }
}
