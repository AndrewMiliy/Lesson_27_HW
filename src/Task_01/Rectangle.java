package Task_01;

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
