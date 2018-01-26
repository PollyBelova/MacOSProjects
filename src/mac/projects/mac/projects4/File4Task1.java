package mac.projects.mac.projects4;

import java.util.Scanner;

public class File4Task1 {

    //Ввести число и определить четное оно, или нет

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");

        int num = scanner.nextInt();
        if (num%2 == 0)
            System.out.println("Чётное");
        else
            System.out.println("Не чётное");
    }

               }