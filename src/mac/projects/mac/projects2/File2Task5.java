package mac.projects.mac.projects2;

import  java.util.Scanner;

public class File2Task5 {

    public static void main(String[] args) {

        // Сколько товара ценой Y можно купить на Х рублей и сколько получить сдачи?

        System.out.print("Введите цену товара: ");
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        System.out.print("Введите сколько у вас денег: ");
        int x = in.nextInt();
        int a = x / y;
        System.out.println("Количество товаров: " + a);
        int b= x%y;
        System.out.println("Сдача: "+b+ " рублей");

    }
    }

