package mac.projects.mac.projects8;

import java.util.Random;
import java.util.Scanner;

public class File8Task1 {

    public static void main(String[] args) {

        /*Выведите на экран номер элемента массива, который равен X
        Если таких элементов несколько, выведите меньший номер
        Выводить на экран номер элемента, который считается от 1
        То есть, начальный элемент массива при выводе на экран считать первым
        Если такого элемента нет, выведите NO */

        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите длину массива: ");

            int longitude = in.nextInt();


            System.out.println();
            int i = longitude + 1;
            //int x = 1;
            int aray[] = new int[i];

            for (i = 1; i < aray.length; i++)


            {
                aray[i] =-100+ random.nextInt(200);
                System.out.print(aray[i] + " \t ");
            }


            System.out.println();

            System.out.println("Введите число Х: ");

            int number = in.nextInt();//число Х

            System.out.println();
            System.out.println("Номер элемента массива: ");
            boolean search=false;
            for  (i = 1 ; i < aray.length;i++)
            {
                if (aray[i] == number) { search=true; break;}
            }

            if (search)  System.out.print(i);
            else  System.out.print("NO") ;
            System.out.println();}



}

