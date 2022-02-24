package Lab_5;

public class Rectangle_Two extends Shape {
    //Operations
    //Default Constructor
    public Rectangle_Two() {
        super(1, 1);
    }

    public Rectangle_Two(int d1, int d2) {
        super(d1, d2);
    }

    public double area() {
        return (this.getD1() * this.getD2());
    }
}
