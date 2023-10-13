package Task_01;

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
