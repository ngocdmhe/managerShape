
package entity;

import utils.Validator;

public class Circle extends Shape{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public void printResult() {
        System.out.println("-----Circle-----");
        System.out.println("Radius: "+radius);
        System.out.println("Area: "+getArea());
        System.out.println("Perimeter: "+getPerimeter());
    }

    @Override
    public void input() {
        radius=Validator.getDouble("Please input radius of Circle:",
                "Please enter number >0", "Invalid!", Double.MIN_VALUE, Double.MAX_VALUE);
    }
    
}
