public class Square extends GeometricObject {
    protected double side;

    public Square() {
        this.side = 1.0;
    }

    public Square(double side){
        this.side = side;
    }

    public Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }

    @Override
    public double getArea() {
        return Math.pow(this.side, 2);
    }

    @Override
    public String getShape() {
        return "Square";
    }

    @Override
    public String toString() {
        return "Square with side " + this.side;
    }
}
