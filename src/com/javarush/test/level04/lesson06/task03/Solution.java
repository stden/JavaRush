package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (b > a) {
            int t = a;
            a = b;
            b = t;
        }
        if (c > b) {
            int t = c;
            c = b;
            b = t;
        }
        if (b > a) {
            int t = a;
            a = b;
            b = t;
        }
        System.out.println(a + " " + b + " " + c);
    }
}
