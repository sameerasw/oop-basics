public abstract class GeometricObject {
    protected boolean filled;
    protected String color;

    public GeometricObject() {
        this.filled = false;
        this.color = "white";
    }

    public GeometricObject(boolean filled, String color) {
        this.filled = filled;
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getPerimeter();
    public abstract double getArea();
    public abstract String getShape();
    public abstract String toString();
}
