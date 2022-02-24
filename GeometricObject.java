package Lab_5;
//Import the 'Date' datatype
import java.util.Date;

public class GeometricObject {
    //Attributes
    private String color;
    private boolean filled;
    private Date dateCreated;

    //Operations
    //Default Constructor
    public GeometricObject() {
        this.color = "White";
        this.filled = false;
        this.dateCreated = new Date();
    }

    public GeometricObject(String c, boolean f) {
        this.color = c;
        this.filled = f;
        this.dateCreated = new Date();
    }

    //Get
    public String getColor() {
        return this.color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public String toString() {
        return ("created on " + this.dateCreated + "\nColor: " +
        this.color + " and Filled: " + this.filled);
    }

    //Set
    public void setColor(String c) {
        this.color = c;
    }

    public void setFilled(boolean f) {
        this.filled = f;
    }
}