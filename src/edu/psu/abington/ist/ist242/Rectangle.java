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
public class Rectangle extends Shape {


    //public Point point = point1;
    private Point point2;
    private Point point3;
    private Point point4;

    //CONSTRUCTOR
    public Rectangle() {
        point = new Point(3,3); //new point1 (5,5) from main CIRCLE
        point2 = new Point(7,3); //new point2 (5,10) from main TRIANGLE
        point3 = new Point(3,5); //new point3 (10,6) from main TRIANGLE
        point4 = new Point(7,5); //new point4 (10,11) from main RECTANGLE
        System.out.println("Rectangle Point-1: X:"+ point.x + " Y:" + point.y);
        System.out.println("Rectangle Point-2: X:"+ point2.x + " Y:" + point2.y);
        System.out.println("Rectangle Point-3: X:"+ point3.x + " Y:" + point3.y);
        System.out.println("Rectangle Point-4: X:"+ point4.x + " Y:" + point4.y+"\n");
    }

    //CONSTRUCTOR
    public Rectangle(Point point1, Point point2, Point point3, Point point4) {
        point = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
        System.out.println("Rectangle Point-1: X:" + point.x + " Y:" + point.y);
        System.out.println("Rectangle Point-2: X:" + point2.x + " Y:" + point2.y);
        System.out.println("Rectangle Point-3: X:" + point3.x+ " Y:" + point3.y);
        System.out.println("Rectangle Point-4: X:" + point4.x+ " Y:" + point4.y+"\n");
    }
}

