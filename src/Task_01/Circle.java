package Task_01;

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
