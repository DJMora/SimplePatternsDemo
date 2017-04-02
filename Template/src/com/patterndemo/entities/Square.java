package com.patterndemo.entities;


public class Square extends Shape {
    private Double side;

    public Square(){
        side = 0.00;
    }

    public Square(Double side){
        this.side = side;
    }

    @Override
    public double getShapeArea() {
        return Math.pow(side,2);
    }

    @Override
    public double getShapePerimeter() {
        return side*4;
    }
}
