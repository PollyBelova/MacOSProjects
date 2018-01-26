package mac.projects.mac.projects5;

import java.util.Scanner;
import java.util.Locale;

public class File5Task1 {

    public static void main(String[] args) {

        //Определить, параллельна ли определенная прямая линия оси ординат,
        //либо оси абсцисс. Прямая задается двумя точками.

        Scanner scInp = new Scanner(System.in).useLocale(Locale.UK);

        System.out.println("Для рассчета координатов 1ой точки введите х: ");

        int x1 = scInp.nextInt();

        System.out.println("Введите y: ");

        int y1 = scInp.nextInt();


        System.out.println("Для рассчета координатов 2ой точки введите х: ");

        int x2 = scInp.nextInt();

        System.out.println("Введите y: ");

        int y2 = scInp.nextInt();


        if (y1 == y2) {
            System.out.println("Прямая параллельна оси абсцисс");
        } else if (x1 == x2) {
            System.out.println("Прямая парралельна оси ординат");
        } else {
            System.out.println("Прямая пересекает оси");
        }
    }
    }

