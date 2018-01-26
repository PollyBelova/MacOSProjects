package mac.projects.mac.projects2;

import  java.util.Scanner;

public class File2Task3 {

    public static void main(String[] args) {

        /* Ввести 3-значное число и удалить из него среднюю цифру
        (например, ввести 3, 5, 7 - получить и вывести число 37) */
        System.out.print("Введите трехзначное число: ");

        Scanner in = new Scanner(System.in);

        int x=in.nextInt();

        x = x / 100 * 10+x % 10;

        System.out.println("Ответ = "+x);

    }
}
