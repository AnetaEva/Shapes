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

public class Main {

    public static void main(String[] args) {

        //new circle
        Circle c1 = new Circle();
        Point p1 = new Point(5,5);
        Circle c2 = new Circle(p1);

        //new triangle
        Triangle t1 = new Triangle();
        Point p2 = new Point(5,10);
        Point p3 = new Point(10,6);
        Triangle t2 = new Triangle(p1, p2, p3);

        //new Rectangle
        Rectangle r1 = new Rectangle();
        Point p4 = new Point(10,11);
        Rectangle r2 = new Rectangle(p1, p2, p3, p4);

    }
}
