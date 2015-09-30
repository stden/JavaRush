package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle {
    double top, left, width = 0, height = 0;

    public void initialize(double top, double left, double width, double height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize(double top, double left, double side) {
        initialize(top, left, side, side);
    }

    public void initialize(double top, double left) {
        initialize(top, left, 0, 0);
    }

    public void initialize(double t) {
        initialize(t, t, 0, 0);
    }

    public void initialize() {
        initialize(0, 0, 0, 0);
    }

    public void initialize(Rectangle r) {
        initialize(r.top, r.left, r.width, r.height);
    }
}
