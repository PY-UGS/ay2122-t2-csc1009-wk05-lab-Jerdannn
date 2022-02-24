package Lab_5;

public class Shape_Main {
    public static void main(String[] args) {
        Rectangle_Two r = new Rectangle_Two(9, 5);
        Triangle t = new Triangle(10, 8);
        Circle_Two c = new Circle_Two(5, 5);
        Ellipse e = new Ellipse(7, 7);
        Square s = new Square(6, 6);

        Shape figref;
        figref = r;
        System.out.println("Inside Area for Rectangle.");
        System.out.println("Area is: " + figref.area());
        figref = t;
        System.out.println("Inside Area for Triangle.");
        System.out.println("Area is: " + figref.area());
        figref = c;
        System.out.println("Inside Area for Circle.");
        System.out.println("Area is: " + figref.area());
        figref = e;
        System.out.println("Inside Area for Ellipse.");
        System.out.println("Area is: " + figref.area());
        figref = s;
        System.out.println("Inside Area for Square");
        System.out.println("Area is: " + figref.area());
    }
}