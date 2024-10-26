public class Rectangle extends GeometricObject {
    protected double width;
    protected double height;

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public String getShape() {
        return "Rectangle";
    }

    @Override
    public String toString() {
        return "Rectangle with width " + this.width + " and height " + this.height;
    }
}
