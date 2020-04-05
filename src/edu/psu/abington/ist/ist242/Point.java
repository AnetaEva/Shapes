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

//Point.java will contain two coordinates x and y.
// This will be reused to create point objects for all the shapes.
public class Point { //basic geometry: to make a point you need X and Y

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}


