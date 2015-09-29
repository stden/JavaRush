package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            int x = scanner.nextInt();
            if (x > max)
                max = x;
        }
        System.out.println(max);
    }
}
