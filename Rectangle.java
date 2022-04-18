package CSC1009_Lab.Lab_5;

public class Rectangle extends Shape {
    // Operations
    // Default Constructors
    public Rectangle() {}

    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    
    @Override
    public double area() {
        System.out.println("Inside Area for Rectangle.");
        // Area of a rectangle is width * height
        return super.getDim1() * super.getDim2();
    }
}
