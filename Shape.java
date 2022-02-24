package Lab_5;

public abstract class Shape {
    //Constant
    //2 d.p. to match the output shown in the
    //tutorial
    static final double PI = 3.14;

    //Attributes
    private float dim1;
    private float dim2;
    //Operations
    //Default Constructor
    public Shape(float d1, float d2) {
        this.dim1 = d1;
        this.dim2 = d2;
    }

    //Get
    public float getD1() {
        return this.dim1;
    }

    public float getD2() {
        return this.dim2;
    }

    //Set
    public void setD1(int d1) {
        this.dim1 = d1;
    }

    public void setD2(int d2) {
        this.dim2 = d2;
    }
    
    //To be used by other classes implementing
    //this abstract class
    abstract double area();
}
