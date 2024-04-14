package desing.pattern.structurls.flyweigth;

public class Circle implements Shape {
    private final String color;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing circle with color " + color + " at (" + x + ", " + y + ") with radius " + radius);
    }
}
