package CSC1009_Lab.Lab_5;

public class CircleFromSimpleGeometricObject extends GeometricObject {
    // Constants
    static final double PI = 3.14159;
    // Attributes
    private double radius;

    // Operations
    // Default Constructor
    public CircleFromSimpleGeometricObject() {}

    public CircleFromSimpleGeometricObject(double r) {
        // 'super' is used to pass parameters into the
        // parent class
        // note: this calls the default constructor
        super();
        this.radius = r;
    }

    public CircleFromSimpleGeometricObject(double r, String c, boolean f) {
        super(c, f);
        this.radius = r;
    }

    // Getters
    public double getRadius() { return this.radius; }

    public double getArea() {
        return PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * PI * this.radius;
    }

    public double getDiameter() {
        return 2 * this.radius;
    }

    // Setters
    public void setRadius(double r) { this.radius = r; }

    // Misc.
    public void printCircle() {
        // References the function from the parent class
        super.toString();
    }
}
