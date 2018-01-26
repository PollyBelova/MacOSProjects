package mac.projects.mac.projects5;

import java.util.Scanner;

public class File5Task3 {

    public static void main(String[] args) {

        //Написать программу, которая позволяет пользователю ввести номер дня недели, и в ответ
        //показывает название этого дня (например 6-это суббота). Решить с использованием If и Switch.

        System.out.println("Введите номер дня недели: ");
        Scanner scInp =new Scanner(System.in);

        int a = scInp.nextInt();

        String d1="Понедельник";
        String d2="Вторник";
        String d3="Среда";
        String d4="Четверг";
        String d5="Пятница";
        String d6="Суббота";
        String d7="Воскресенье";
        String e="Введите число от 1 до 7";

        System.out.println((a==1)?d1:(a==2)?d2:(a==3)?d3:(a==4)?d4:(a==5)?d5:(a==6)?d6:(a==7)?d7:e);
    }

}

