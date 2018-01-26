package mac.projects.mac.projects1;

import java.util.Scanner;

public class File1Task4 {

    public static void main(String[] args) {

        //Написать программу, которая находит среднее арифметическое значение трёх вещественных чисел

        Scanner in = new Scanner(System.in);
        System.out.println("введите первое натуральное число");
        double x = in.nextDouble();
        System.out.println("введите второе натуральное число");
        double y = in.nextDouble();
        System.out.println("введите третье натуральное число");
        double z = in.nextDouble();

        double v = (x + y + z) / 3;
        System.out.format("среднее арифметическое = " + "%.2f", +v);
    }
}
