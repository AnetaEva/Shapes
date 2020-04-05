/*
Project: Lab 11
Purpose Details: Java Inheritance Point, Shape, Circle, Triangle, Rectangle
Course: IST 242
Author: Aneta O'Donnell
Date Developed: 4/2/2020
Last Date Changed: 4/2/2020
Rev: 0
 */

package edu.psu.abington.ist.ist242;

//Circle.java, Triangle.java, Rectangle.java will all be children of Shapes.java class

//circle inherits the POINTS class points X & Y but you also need one other thing to make a circle which is a RADIUS
public class Circle extends Shape {

    /*QUESTION: what are my points to make a circle? Plot the MIDDLE of a circle
    when you know what the X and Y are and then when you know what the RADIUS
    is you can draw a perfect circle
    */

    //int x; - this comes from the Points Class
    //int y; - this comes from the Points Class
    private int radius;
    //private int diameter; diameter = 2 * Radius
    // circumference = 2 * 3.14(pi) * Radius

    //CONSTRUCTOR
    public Circle() {
        point = new Point(2,3); //new point1 (5,5) from main CIRCLE
        radius = 2; //making a radius
        System.out.println("Circle Point: X:" + point.x + " Y:" + point.y);
        System.out.println("Circle radius:" + radius + "\n");
    }
    //CONSTRUCTOR
    public Circle(Point point) {
        this.point = point; //new point1 (5,5)
        radius = 5; //making a new radius
        System.out.println("Circle Point: X:" + point.x + " Y:" + point.y);
        System.out.println("Circle radius:" + radius +"\n");
    }

}

