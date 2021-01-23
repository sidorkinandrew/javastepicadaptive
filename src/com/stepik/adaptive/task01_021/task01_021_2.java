package com.stepik.adaptive.task01_021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Figure {
    double getArea();
}

class Triangle implements Figure {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        double p = 0.5*(a+b+c);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}

class Rectangle implements Figure {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getArea() {
        return a*b;
    }
}

class Circle implements Figure {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return 3.14*r*r;
    }
}

class task01_021_2 {
    public static void main(String[] args)  throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String mode = reader.readLine().trim();
            switch(mode) {
                case "triangle":
                    Figure aTriangle = new Triangle(Double.parseDouble(reader.readLine().trim()), Double.parseDouble(reader.readLine().trim()), Double.parseDouble(reader.readLine().trim()));
                    System.out.println(aTriangle.getArea());
                    break;
                case "rectangle":
                    Figure aRectangle = new Rectangle(Double.parseDouble(reader.readLine().trim()), Double.parseDouble(reader.readLine().trim()));
                    System.out.println(aRectangle.getArea());
                    break;
                case "circle":
                    Figure aCircle = new Circle(Double.parseDouble(reader.readLine().trim()));
                    System.out.println(aCircle.getArea());
                    break;
            }
        } catch (IOException | NumberFormatException | ArithmeticException e) {
            System.out.println("Error happened!");
        }
    }
}

