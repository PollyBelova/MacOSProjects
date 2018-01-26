package mac.projects.mac.projects7;

import java.util.*;

public class File7Task1 {

    public static void main(String[] args) {

        /* Задать случайно 100 целых чисел в диапазоне от -100 до 100. Вычислить процент положительных чисел,
        процент отрицательных чисел и процент нулей. Вычислить процент четных чисел и процент нечетных.
         */
        System.out.println("Все числа: ");
        Random rand = new Random();
        int x_p = 0;// Положительное число
        int x_n = 0;// Отрицательное

        int even = 0;// Четное число
        int odd = 0;// Нечетное число
        int num = 0;

        for (int i = 0; i < 100; i++) {
            int x = -100 + rand.nextInt(200);
            System.out.print(x + " ");
            num++;

            if (x >= 0) {
                x_p++;
            } else {
                x_n++;
            }

            if (x % 2 == 0) even++;
            else odd++;
        }
        System.out.println();
        System.out.println("Всего чисел: " + num);
        System.out.println();
        System.out.println("Положительных чисел: " + x_p * 100 / num + " %");
        System.out.println("Отрицаельных чисел: " + x_n * 100 / num + " %");
        System.out.println();
        System.out.println("Четных чисел: " + even * 100 / num + " %");
        System.out.println("Нечетных чисел: " + odd * 100 / num + " %");
    }
    }

