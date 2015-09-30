package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend {
    String name;
    int age = 10;
    String sex = "male";

    public Friend(String name) {
        this(name, 10);
    }

    public Friend(String name, int age) {
        this(name, 10, "male");
    }

    public Friend(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}