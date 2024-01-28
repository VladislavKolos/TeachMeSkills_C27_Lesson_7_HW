package com.teachmeskills.hw7.task2.figure;

/**
 * Abstract class for type of the figures
 * contains field name
 * contains constructor
 * contains three required abstract methods: calculate area, calculate perimeter, information output.
 */
public abstract class Figure {
    public String name;

    public Figure(String name) {
        this.name = name;
    }

    public abstract void calculateArea(double area);

    public abstract double calculatePerimeter(double perimeter);

    public abstract void informationOutput();
}
