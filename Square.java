package Lab_5;

public class Square extends Shape {
    //Operations
    //Default Constructor
    public Square() {
        super(1, 1);
    }

    public Square(int d1, int d2) {
        super(d1, d2);
    }

    public double area() {
        return (this.getD1() * this.getD2());
    }
}
