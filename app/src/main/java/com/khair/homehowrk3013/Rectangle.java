package com.khair.homehowrk3013;

public class Rectangle extends Shape{

    private int length;
    private int width;

    public Rectangle(int length,int width){
        this.length=length;
        this.width=width;

    }


    @Override
    public double getArea() {
        double area = length * width;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * (length + width);
        return perimeter;
    }
}
