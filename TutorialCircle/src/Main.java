public class Main {
    public static void main(String[] args) {

        Circle c = new Circle();
        System.out.println("The circle has radius of " + c.getRadius() + " and area of " + c.getArea());


        Circle c2 = new Circle(8.0);
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());

        c2.setRadius(10.0);
        System.out.println(c2.getArea());

        Circle c3 = new Circle(5.0, "red");
        System.out.println("The circle has radius of " + c3.getRadius() + " and area of " + c3.getArea() + " and color of " + c3.getColor());

        c3.setColor("green");
        System.out.println(c3.getColor());
    }
}