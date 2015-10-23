package com.javarush.test.level07.lesson06.task02;

import java.util.ArrayList;
import java.util.Scanner;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // 1. Создай список строк.
        ArrayList<String> list = new ArrayList<String>();
        // 2. Считай с клавиатуры 5 строк и добавь в список.
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
        }
        // 3. Используя цикл, найди самую длинную строку в списке.
        int m = list.get(0).length();
        for (String s : list)
            if (s.length() > m)
                m = s.length();
        // 4. Выведи найденную строку на экран.
        // 5. Если таких строк несколько, выведи каждую с новой строки.
        for (String s : list)
            if (s.length() == m)
                System.out.println(s);
    }
}
