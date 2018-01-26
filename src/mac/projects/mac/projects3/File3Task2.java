package mac.projects.mac.projects3;


import java.util.Scanner;


public class File3Task2 {

    public static void main(String[] args) {

    //Пользователь вводит с клавиатуры два дробных числа. Вывести на экран сумму целых частей и сумму дробных.

        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое дробное число: ");
        float a = in.nextFloat();
        System.out.println("Введите второе дробное число: ");
        float b = in.nextFloat();

        float a1 = a * 100 % 100;
        float b1 = b * 100 % 100;

        float d = (a1 + b1) / 100, c = a + b - d;

        System.out.println("Сумма целых частей двух чисел: " + c);
        System.out.println("Сумма дробных частей двух чисел: " + d);


}}
