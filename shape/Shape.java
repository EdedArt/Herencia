package shape;

public abstract class Shape {
    public abstract double area();

    public void display() {
        System.out.println("Area: " + String.format("%.2f", area()));
    }
}
