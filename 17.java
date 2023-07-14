package co4;
import java.util.Scanner;
interface Figure {
float calculateArea();
}
class Rectangle implements Figure {
private float length;
private float width;
public Rectangle(float length, float width) {
this.length = length;
this.width = width;
}
public float calculateArea() {
return length * width;
}
}
class Triangle implements Figure {
private float base;
private float height;
public Triangle(float base, float height) {
this.base = base;
this.height = height;
}
public float calculateArea() {
return 0.5f * base * height;
}
}
class Square implements Figure {
private float side;
public Square(float side) {
this.side = side;
}
public float calculateArea() {
return side * side;
}
}
class Circle implements Figure {
private float radius;
public Circle(float radius) {
this.radius = radius;
}
public float calculateArea() {
return 3.14f * radius * radius;
}
}
public class prgrm1 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the length of the rectangle: ");
float rectLength = scanner.nextFloat();
System.out.print("Enter the width of the rectangle: ");
float rectWidth = scanner.nextFloat();
Rectangle rectangle = new Rectangle(rectLength, rectWidth);
System.out.println("Area of the rectangle: " + rectangle.calculateArea());
System.out.print("Enter the base length of the triangle: ");
float triBase = scanner.nextFloat();
System.out.print("Enter the height of the triangle: ");
float triHeight = scanner.nextFloat();
Triangle triangle = new Triangle(triBase, triHeight);
System.out.println("Area of the triangle: " + triangle.calculateArea());
System.out.print("Enter the side length of the square: ");
float squareSide = scanner.nextFloat();
Square square = new Square(squareSide);
System.out.println("Area of the square: " + square.calculateArea());
System.out.print("Enter the radius of the circle: ");
float circleRadius = scanner.nextFloat();
Circle circle = new Circle(circleRadius);
System.out.println("Area of the circle: " + circle.calculateArea());
scanner.close();
}
}
