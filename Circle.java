package Lab_5;

public class Circle extends GeometricObject {
    //Constants
    static final double PI = 3.1415926;

    //Attributes
    private double radius;

    //Operations
    //Default Constructor
    public Circle() {
        super("White", false);
        this.radius = 1;
    }

    public Circle(double r) {
        super("White", false);
        this.radius = r;
    }

    public Circle(double r, String c, boolean f) {
        super(c, f);
        this.radius = r;
    }

    //Get
    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return (PI * this.radius * this.radius);
    }

    public double getPerimeter() {
        return (2 * PI * this.radius);
    }

    public double getDiameter() {
        return (2 * this.radius);
    }

    //Set
    public void setRadius(double r) {
        this.radius = r;
    }

    public void printCircle() {
        System.out.print("This circle is created on " + this.getDateCreated() + 
        "\nColor: " + this.getColor() + " and Filled: " + this.isFilled());
    }
}