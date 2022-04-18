package CSC1009_Lab.Lab_5;

public class Ellipse extends Shape {
    // Operations
    // Default Constructors
    public Ellipse() {}

    public Ellipse(double dim1, double dim2) {
        super(dim1, dim2);
    }
    
    @Override
    public double area() {
        System.out.println("Inside Area for Ellipse.");
        // Area of an ellipse is pi * a * b
        return PI * super.getDim1() * super.getDim2();
    }
}
