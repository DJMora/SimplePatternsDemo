package com.patterndemo.entities;

//Representacion de un triangulo equilatero

public class Triangle extends Shape{
    private Double baseSide;
    private Double height;

    public Triangle(){
        baseSide = 0.00;
        height = 0.00;
    }

    public Triangle(Double baseSide, Double height){
        this.baseSide = baseSide;
        this.height = height;
    }

    @Override
    public double getShapeArea() {
        Double area = (baseSide * height)/2;
        return area;
    }

    @Override
    public double getShapePerimeter() {
        return 3*baseSide;
    }
}
