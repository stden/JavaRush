package samples;

import java.util.Scanner;

public class Rect
{
    public static void main(String[] args)
    {
        // Создаем сканер
        Scanner sc = new Scanner(System.in);
        // ввести два числа
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int a = 1; a <= m; a++)
        {
            for (int b = 1; b <= n; b++)
                System.out.print(8);
            System.out.println();
        }
    }
}
