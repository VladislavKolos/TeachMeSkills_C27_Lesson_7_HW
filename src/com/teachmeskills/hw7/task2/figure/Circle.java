package com.teachmeskills.hw7.task2.figure;

/**
 * Class for the circle figures type
 * contains fields pi and radius
 * contains constructor
 * contains three required method calculate area, calculate perimeter, information output.
 */
public class Circle extends Figure {
    public double pi = 3.14159;
    public double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void calculateArea(double area) {
        if (this.radius <= 0) {
            System.out.println("Object parameters are incorrect");
        } else {
            area = pi * this.radius * this.radius;
            System.out.println("The area is: " + area);
        }
    }

    @Override
    public double calculatePerimeter(double perimeter) {
        if (this.radius <= 0) {
            System.out.println("Object parameters are incorrect");
        } else {
            perimeter = 2 * pi * this.radius;
            System.out.println("The perimeter is: " + perimeter);
            System.out.println("___________________________________");
        }
        return perimeter;
    }

    public void informationOutput() {
        System.out.println();
        System.out.println("The name of the circle is: " + super.name + "," + " Pi is: " + pi + "," + " The radius of the circle is: " + this.radius);
        System.out.println();
    }
}