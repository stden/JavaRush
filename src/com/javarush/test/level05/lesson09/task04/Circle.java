package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle {
    double centerX;
    double centerY;
    double radius;
    double width;
    String color;

    public Circle(double centerX, double centerY, double radius) {
        this(centerX, centerY, radius, 1, "black");
    }

    public Circle(double centerX, double centerY, double radius, double width) {
        this(centerX, centerY, radius, width, "black");
    }

    public Circle(double centerX, double centerY, double radius, double width, String color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }

}
