package com.javarush.test.level07.lesson04.task04;

import java.util.Scanner;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // 1. Создать массив на 10 чисел.
        int[] ints = new int[10];
        // 2. Ввести с клавиатуры 10 чисел и записать их в массив.
        for (int i = 0; i < 10; i++) ints[i] = scanner.nextInt();
        // 3. Расположить элементы массива в обратном порядке.
        for (int i = 0; i < 5; i++) {
            int t = ints[i];
            ints[i] = ints[10 - i - 1];
            ints[10 - i - 1] = t;
        }
        // 4. Вывести результат на экран, каждое значение выводить с новой строки.
        for (int i = 0; i < 10; i++) System.out.println(ints[i]);
    }
}
