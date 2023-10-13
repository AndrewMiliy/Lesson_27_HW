package Task_01;

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
