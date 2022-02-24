package Lab_5;

public class Triangle extends Shape {
    //Operations
    //Default Constructor
    public Triangle() {
        super(1, 1);
    }

    public Triangle(int d1, int d2) {
        super(d1, d2);
    }

    public double area() {
        return (this.getD1() * this.getD2()) / 2;
    }
}
