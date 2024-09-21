package com.khair.homehowrk3013;

public class Circle extends Shape{

    private int radius;


    public Circle(int radius){
        this.radius=radius;


    }




    @Override
    public double getArea() {
        double area = Math.PI * Math.pow(radius, 2);

        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;

        return perimeter;
    }


}
