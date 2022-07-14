package com.syntax.GroupProject2;

public interface Shape {
   /*
    Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
    Test your code.
     */

    void calculateArea();

    void calculatePerimeter();
}

class Circle implements Shape {

    double radius = 15.5;

    @Override
    public void calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is: " + area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("The perimeter of the circle is: " + perimeter);
    }
}

class Square implements Shape {

    double sideLength = 20;

    @Override
    public void calculateArea() {
        double area = Math.pow(sideLength, 2);
        System.out.println("The area of the square is: " + area);

    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 4 * sideLength;
        System.out.println("The perimeter of the square is: " + perimeter);

    }

    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Square()};

        for (Shape shape : shapes) {
            shape.calculateArea();
            shape.calculatePerimeter();
        }
    }
}