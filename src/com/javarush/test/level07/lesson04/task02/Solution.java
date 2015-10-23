package com.javarush.test.level07.lesson04.task02;

import java.util.Scanner;

/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] s = new String[10];
        for (int i = 0; i < 8; i++) s[i] = scanner.nextLine();
        for (int i = 9; i >= 0; i--) System.out.println(s[i]);
    }
}