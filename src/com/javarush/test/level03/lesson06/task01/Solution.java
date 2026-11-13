package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        String s[] = new String[]{"Мама", "Мыла", "Раму"};
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (j != i)
                    for (int k = 0; k < 3; k++)
                    {
                        if (k != i && k != j)
                            System.out.println(s[i] + s[j] + s[k]);
                    }

    }
}