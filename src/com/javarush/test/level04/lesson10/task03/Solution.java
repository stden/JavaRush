package com.javarush.test.level04.lesson10.task03;

import java.util.Scanner;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int times = scanner.nextInt();
        int i = 0;
        while (i < times) {
            System.out.println(s);
            i++;
        }
    }
}
