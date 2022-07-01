public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double r) {
        radius = r;
        color = "red";
    }

    public Circle(double r, String c) {
        this.radius = r;
        this.color = c;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String getColor () {
        return color;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public String toString() {
        return "Circle: radius=" + radius + " color=" +color;
    }

}
