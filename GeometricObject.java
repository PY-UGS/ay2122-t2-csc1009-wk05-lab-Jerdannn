package CSC1009_Lab.Lab_5;

public class GeometricObject {
    // Attributes
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    // Operations
    // Default Constructor
    public GeometricObject() {
        this.color = "White";
        this.filled = false;
        this.dateCreated = new java.util.Date();
    }

    public GeometricObject(String col, boolean fill) {
        this.color = col;
        this.filled = fill;
        this.dateCreated = new java.util.Date();
    }

    // Getters
    public String getColor() { return this.color; }

    public boolean isFilled() { return this.filled; }

    public java.util.Date getDateCreated() { return this.dateCreated; }

    // Setters
    public void setColor(String c) { this.color = c; }

    public void setFilled(boolean f) { this.filled = f; }

    // Misc.
    public String toString() {
        String temp = "created on " + this.dateCreated +
        "\ncolor: " + this.color + " and filled: " + this.filled;
        return temp;
    }
}
