package mac.projects.mac.projects4;

import java.util.Scanner;

public class File4Task2 {
    public static void main(String[] args) {

        //Ввести три числа и найти наименьшее из них

    Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
    int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
    int num2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
    int num3 = scanner.nextInt();

    int min = Math.min(Math.min(num1,num2),num3);

        System.out.print("Наименьшее число = ");
        System.out.println(min);
}}



