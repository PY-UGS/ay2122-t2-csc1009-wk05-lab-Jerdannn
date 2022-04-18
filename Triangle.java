package CSC1009_Lab.Lab_5;

public class Triangle extends Shape {
    // Operations
    // Default Constructors
    public Triangle() {}

    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    
    @Override
    public double area() {
        System.out.println("Inside Area for Triangle.");
        // Area of a triangle is 1/2 * width * height
        return super.getDim1() * super.getDim2() / 2;
    }
}
