package Lab_5;

public class Rectangle extends GeometricObject {
    //Attributes
    private double width;
    private double height;

    //Operations
    //Default Constructor
    public Rectangle() {
        super("White", false);
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double w, double h) {
        super("White", false);
        this.width = w;
        this.height = h;
    }

    public Rectangle(double w, double h, String c, boolean f) {
        super(c, f);
        this.width = w;
        this.height = h;
    }

    //Get
    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public double getArea() {
        return (this.height * this.width);
    }

    public double getPerimeter() {
        return (2 * (this.height + this.width));
    }

    //Set
    public void setWidth(double w) {
        this.width = w;
    }

    public void setHeight(double h) {
        this.height = h;
    }
}