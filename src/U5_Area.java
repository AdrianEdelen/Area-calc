/**-----Adrian Edelen-----
 * A program to calculate the area of various shapes
 * circle, rectangle, sphere, and pyramid
 */



import java.util.Scanner;


public class U5_Area {
    public static void main(String[] args) throws IllegalArgumentException {
        try {
            Scanner userInput = new Scanner(System.in);
            /**------Circle-----*/
            //circle area calc
            System.out.print("Enter the radius for a circle: ");
            double circleRadius = userInput.nextDouble();
            Shape c = new Circle(circleRadius);
            //print the  circle area
            System.out.print("The area of a circle with radius " + circleRadius + " is ");
            System.out.printf("%.2f", c.area());
            System.out.println();
            System.out.println();
            /**------End Circle-----*/

            /**------Rectangle-----*/
            //rectangle area clc
            System.out.print("Enter the length for a rectangle: ");
            double recLength = userInput.nextDouble();
            System.out.print("Enter the width for a rectangle: ");
            double recWidth = userInput.nextDouble();
            Shape r = new Rectangle(recLength, recWidth);
            //print the rectangle area
            System.out.print("The area of a rectangle with length " + recLength + " and width " + recWidth + " is ");
            System.out.printf("%.2f", r.area());
            System.out.println();
            System.out.println();
            /**------End Rectangle-----*/

            /**------Sphere-----*/
            //sphere surface area calc
            System.out.print("Enter the radius for a sphere: ");
            double sphereRadius = userInput.nextDouble();
            Shape s = new Sphere(sphereRadius);
            //print the surface area sphere
            System.out.print("The surface area of a sphere with radius " + sphereRadius + " is ");
            System.out.printf("%.2f", s.area());
            System.out.println();
            System.out.println();
            /**------End Sphere-----*/

            /**------Pyramid-----*/
            //pyramid surface area calc
            System.out.print("Enter the length of the base for a pyramid: ");
            double pLength = userInput.nextDouble();
            System.out.print("Enter the width of the base for a pyramid: ");
            double pWidth = userInput.nextDouble();
            System.out.print("Enter the height from the base to the apex for a pyramid: ");
            double pHeight = userInput.nextDouble();
            Shape p = new Pyramid(pLength, pWidth, pHeight);
            System.out.print("The surface area of a pyramid with base length " + pLength + ", base width " + pWidth + ", and height " + pHeight + " is ");
            System.out.printf("%.2f", p.area());
            System.out.println();
            System.out.println();
            /**------End Pyramid-----*/

        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }



    }
}
/** Shape Class - parent class for all other classes*/
class Shape {
    /** this method is invoked if you create an object that is a shape only */
    double area() {
        System.out.println("Oops - 'area' cannot be calculated because type of shape is unknown!");

        return 0;
    }
}
/**  Circle class */
class Circle extends Shape {
    private double radius = 1;

    // no-arg constructor
    public Circle() {
    }

    //constructor that receives radius
    public Circle(double radius) throws IllegalArgumentException {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than 0");
        }
        this.radius = radius;
    }


    //getter and setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //calc the area of a circle
    @Override
    double area () {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}
/**  Rectangle class */
class Rectangle extends Shape {
    private double length = 1;
    private double width = 1;

    // no-arg constructor
    public Rectangle() {
    }

    //constructor that receives length + width
    public Rectangle(double length, double width) throws IllegalArgumentException {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.length = length;
        this.width = width;
    }


    //getters and setters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    //calcs the area of a rectangle
    @Override
    double area() {
        double area = length * width;
        return area;
    }
}
/**  Sphere class */
class Sphere extends Shape {
    private double radius = 1;

    // no-arg constructor
    public Sphere() {
    }

    //constructor that receives radius
    public Sphere(double radius) throws IllegalArgumentException {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than 0");
        }
        this.radius = radius;

    }


    //getter and setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //calcs the area of the sphere
    @Override
    double area() {
        double area = 4 * Math.PI * Math.pow(radius, 2);
        return area;
    }
}
/**  Pyramid class */
class Pyramid extends Shape {
    private double length = 1;
    private double width = 1;
    private double height = 1;

    // no-arg constructor
    public Pyramid() {
    }

    //constructor that receives length width and height
    public Pyramid(double length, double width, double height) throws IllegalArgumentException {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be greater than 0");
        }
        this.length = length;
        this.width = width;
        this.height = height;
    }


    //getters and setters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    //Calcs the area of the pyramid
    @Override
    double area() {
        double area = length * width + length * Math.sqrt(Math.pow((width / 2), 2) + Math.pow(height, 2)) + width * Math.sqrt(Math.pow((length / 2), 2) + Math.pow(height, 2));
        return area;
    }
}