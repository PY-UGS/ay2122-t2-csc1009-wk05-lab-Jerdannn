package CSC1009_Lab.Lab_5;

public  class RectangleFromSimpleGeometricObject extends GeometricObject {
    // Attributes
    private double width;
    private double height;

    // Operations
    // Default Constructor
    public RectangleFromSimpleGeometricObject() {}

    public RectangleFromSimpleGeometricObject(double w, double h) {
        // 'super' is used to pass parameters into the
        // parent class
        // note: this calls the default constructor
        super();
        this.width = w;
        this.height = h;
    }

    public RectangleFromSimpleGeometricObject(double w, double h, String c, boolean f) {
        super(c, f);
        this.width = w;
        this.height = h;
    }

    // Getters
    public double getWidth() { return this.width; }

    public double getHeight() { return this.height; }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    // Setters
    public void setWidth(double w) { this.width = w; }

    public void setHeight(double h) { this.height = h; }
}
