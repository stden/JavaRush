package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
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

    public void initialize(double centerX, double centerY, double radius) {
        initialize(centerX, centerY, radius, 1, "black");
    }

    public void initialize(double centerX, double centerY, double radius, double width) {
        initialize(centerX, centerY, radius, width, "black");
    }

    public void initialize(double centerX, double centerY, double radius, double width, String color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
}
