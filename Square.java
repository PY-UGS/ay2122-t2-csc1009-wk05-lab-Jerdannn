package CSC1009_Lab.Lab_5;

public class Square extends Shape {
    // Operations
    // Default Constructors
    public Square() {}

    public Square(double dim1, double dim2) {
        super(dim1, dim2);
    }
    
    @Override
    public double area() {
        System.out.println("Inside Area for Square.");
        // Area of a square is width * height
        return super.getDim1() * super.getDim2();
    }
}
