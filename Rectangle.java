public class Rectangle {

    // Instance variables for length and width
    private double length;
    private double width;

    // Parameterized constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Copy constructor to create a new Rectangle from another Rectangle object
    public Rectangle(Rectangle other) {
        this.length = other.length;
        this.width = other.width;
    }

    // Method to display the rectangle details
    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }

    // Method to calculate the area of the rectangle
    public double area() {
        return length * width;
    }

    public static void main(String[] args) {
        // Creating a Rectangle object using the parameterized constructor
        Rectangle rect1 = new Rectangle(10.5, 5.2);

        // Displaying the details of rect1
        System.out.println("Rectangle 1:");
        rect1.display();
        System.out.println("Area of Rectangle 1: " + rect1.area());

        // Creating another Rectangle object using the copy constructor
        Rectangle rect2 = new Rectangle(rect1);

        // Displaying the details of rect2 (which is a copy of rect1)
        System.out.println("\nRectangle 2 (Copy of Rectangle 1):");
        rect2.display();
        System.out.println("Area of Rectangle 2: " + rect2.area());
    }
}
