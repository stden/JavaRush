package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend {
    String name;
    int age = 10;
    String sex = "male";

    public void initialize(String name) {
        initialize(name, 10);
    }

    public void initialize(String name, int age) {
        initialize(name, 10, "male");
    }

    public void initialize(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
