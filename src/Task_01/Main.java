package Task_01;

abstract class Shape {
    public String shapeName;
    public abstract double area();
    public abstract double perimeter();
}

class Circle extends Shape {
    private double radius;

    // radius - радиус
    public Circle(double radius) {
        this.radius = radius;
        this.shapeName = "Circle";
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    // width и height - ширина и высота
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.shapeName = "Rectangle";
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}

class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    // sideA, sideB и sideC - длины сторон
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.shapeName = "Triangle";
    }

    @Override
    public double area() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}

class Pentagon extends Shape {
    private double side;

    // side - длина стороны
    public Pentagon(double side) {
        this.side = side;
        this.shapeName = "Pentagon";
    }

    @Override
    public double area() {
        return (Math.sqrt(25 + 10 * Math.sqrt(5)) * side * side) / 4;
    }

    @Override
    public double perimeter() {
        return 5 * side;
    }
}

class Trapezoid extends Shape {
    private double sideA;
    private double sideB;
    private double height;

    // sideA и sideB - параллельные стороны, height - высота
    public Trapezoid(double sideA, double sideB, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        this.shapeName = "Trapezoid";
    }

    @Override
    public double area() {
        return (sideA + sideB) * height / 2;
    }

    @Override
    public double perimeter() {
        // Для простоты предположим, что непараллельные стороны равны высоте
        return sideA + sideB + 2 * height;
    }
}

class Ellipse extends Shape {
    private double a;
    private double b;

    // a - большая полуось, b - малая полуось
    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
        this.shapeName = "Ellipse";
    }

    @Override
    public double area() {
        return Math.PI * a * b;
    }

    @Override
    public double perimeter() {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }
}

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
