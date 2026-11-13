package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: маму, папу, сына, дочь, бабушку(мамина мама) и дедушку(папин папа).
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Cat name is дедушка Вася, no mother, no father
        Cat дедушка = new Cat(reader.readLine(), null, null);
        // Cat name is бабушка Мурка, no mother, no father
        Cat бабушка = new Cat(reader.readLine(), null, null);
        // Cat name is папа Котофей, no mother, father is дедушка Вася
        Cat папа = new Cat(reader.readLine(), дедушка, null);
        // Cat name is мама Василиса, mother is бабушка Мурка, no father
        Cat мама = new Cat(reader.readLine(), null, бабушка);
        // Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
        Cat сын = new Cat(reader.readLine(), папа, мама);
        // Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
        Cat дочь = new Cat(reader.readLine(), папа, мама);

        System.out.println(дедушка);
        System.out.println(бабушка);
        System.out.println(папа);
        System.out.println(мама);
        System.out.println(сын);
        System.out.println(дочь);
    }

    public static class Cat {
        private String name;
        private Cat father, mother;

        Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            String s = "Cat name is " + name + ",";
            if (mother == null)
                s += " no mother";
            else
                s += " mother is " + mother.name;
            s += ",";
            if (father == null)
                s += " no father";
            else
                s += " father is " + father.name;
            return s;
        }
    }

}
