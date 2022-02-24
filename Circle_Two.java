package Lab_5;

public class Circle_Two extends Shape {
    //Operations
    //Default Constructor
    public Circle_Two() {
        super(1, 1);
    }

    public Circle_Two(int d1, int d2) {
        super(d1, d2);
    }

    public double area() {
        return (PI * this.getD1() * this.getD2());
    }
}
