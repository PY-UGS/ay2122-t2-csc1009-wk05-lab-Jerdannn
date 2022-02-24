package Lab_5;

public class Ellipse extends Shape {
    //Operations
    //Default Constructor
    public Ellipse() {
        super(1, 1);
    }

    public Ellipse(int d1, int d2) {
        super(d1, d2);
    }

    public double area() {
        return (PI * this.getD1() * this.getD2());
    }
}
