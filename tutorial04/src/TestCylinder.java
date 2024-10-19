public class TestCylinder {
    public static void main (String[] args) {

        // Declare and allocate a new instance of cylinder
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder:"
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " base area=" + c1.getArea()
                + " volume=" + c1.getVolume());
        // Declare and allocate a new instance of cylinder, specifying Height
        Cylinder c2 = new Cylinder(5.0);
        System.out.println("Cylinder:"
                        + " radius=" + c2.getRadius()
                        + " height=" + c2.getHeight()
                        + " base area=" + c2.getArea()
                        + " volume=" + c2.getVolume());

        // Declare and allocate a new instance of cylinder specifying radius and height
        Cylinder c3 = new Cylinder(5.0, 5.0);
        System.out.println("Cylinder:"
                + " radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " base area=" + c3.getArea()
                + " volume=" + c3.getVolume());


        //circle with radius 5.0 and color red
        Circle circle = new Circle(5.0, "red");
        System.out.println("Circle:"
                + " radius=" + circle.getRadius()
                + " color=" + circle.getColor()
                + " area=" + circle.getArea());
    }
}