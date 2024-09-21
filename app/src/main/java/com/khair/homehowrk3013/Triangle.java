package com.khair.homehowrk3013;

public class Triangle extends Shape{

    private int a;
    private int b;
    private int c;

    public Triangle (int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }



    @Override
    public double getArea() {

        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = a + b + c;
        return perimeter;
    }
}
