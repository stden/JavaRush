package com.javarush.test.level07.lesson06.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        // 1. Создай список строк
        ArrayList<String> list = new ArrayList<String>();
        // 2. Добавь в него 5 строчек с клавиатуры
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        // 3. Удали последнюю строку и вставь её в начало. Повторить 13 раз
        for (int i = 0; i < 13; i++) {
            String s = list.remove(list.size() - 1);
            list.add(0, s);
        }
        // 4. Используя цикл выведи содержимое на экран, каждое значение с новой строки
        for (String s : list)
            System.out.println(s);
    }
}
