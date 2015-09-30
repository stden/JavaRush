package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(reader);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            if (x > maximum || i == 0)
                maximum = x;
        }
        System.out.println(maximum);
    }
}
