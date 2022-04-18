package CSC1009_Lab.Lab_5;

// An abstract class cannot be instantiated and
// functions as a base for the subclasses
public abstract class Shape {
    // Constants
    static final double PI = 3.14159;

    // Attributes
    private double dim1;
    private double dim2;

    // Operations
    // Default Constructor
    public Shape() {}

    public Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    // Getters
    public double getDim1() { return this.dim1; }

    public double getDim2() { return this.dim2; }

    // Setters
    public void setDim1(double d) { this.dim1 = d; }

    public void setDim2(double d) { this.dim2 = d; }

    // Abstract method to be overriden
    public abstract double area();
}
