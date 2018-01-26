package mac.projects.mac.projects1;

import java.util.Scanner;

public class File1Task6 {

    public static void main(String[] args) {
        // "Программа вычисляет указанную степень введенного числа"

        Scanner in= new Scanner(System.in);
        System.out.println("Введите число и его степень:");
        int a = in.nextInt(), b = in.nextInt();
        double x = Math.pow(a,b);
        System.out.println("Равно "+"= "+x);
    }


}
