package Task_01;

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
