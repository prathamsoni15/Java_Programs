package area_of_circle;

public class mainclass {
    public static void main(String[] args) {
        // Create a circle object with radius 5
        circle c1 = new circle(2);

        // Calculate the area
        double area = c1.calculateArea();

        System.out.println("Area of circle with radius " + c1.getRadius() + " is: " + area);
    }
}
