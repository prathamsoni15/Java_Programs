package area_of_circle;

public class circle {
    private double radius; // Radius of the circle
    private double pi = Math.PI; // Using Java's built-in constant for pi

    public circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return pi * radius * radius;
    }

    @Override
    public String toString() {
        return "circle [radius=" + radius + "]";
    }
}
