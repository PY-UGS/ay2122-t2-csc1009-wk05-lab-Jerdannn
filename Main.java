package CSC1009_Lab.Lab_5;

public class Main {
    public static void main(String[] args) {

        System.out.println("Question 1: Geometric Objects");

        CircleFromSimpleGeometricObject circle =
        new CircleFromSimpleGeometricObject(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        RectangleFromSimpleGeometricObject rectangle = 
        new RectangleFromSimpleGeometricObject(2, 4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());

        System.out.println("\nQuestion 2: Shapes");
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Circle c =  new Circle(5, 5);
        Ellipse e = new Ellipse(7, 7);
        Square s = new Square(6, 6);

        // This is okay as no object is being created
        Shape figref;
        figref = r;
        System.out.println("Area is " + figref.area());
        figref = t;
        System.out.println("Area is " + figref.area());
        figref = c;
        System.out.printf("Area is %.2f\n", figref.area());
        figref = e;
        System.out.printf("Area is %.2f\n", figref.area());
        figref = s;
        System.out.println("Area is " + figref.area());
    }
}
