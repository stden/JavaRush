package com.javarush.test.level06.lesson08.task04;

import java.util.Scanner;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
boolean readBoolean() – читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false
Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        return new Scanner(System.in).nextLine();
    }

    public static int readInt() throws Exception {
        return new Scanner(System.in).nextInt();
    }

    public static double readDouble() throws Exception {
        return new Scanner(System.in).nextDouble();
    }

    public static boolean readBoolean() throws Exception {
        return new Scanner(System.in).nextBoolean();
    }
}
