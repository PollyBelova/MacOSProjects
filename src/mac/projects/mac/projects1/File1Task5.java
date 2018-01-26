package mac.projects.mac.projects1;

import java.util.Scanner;

public class File1Task5 {

    public static void main(String[] args) {

        //Написать программу, которая находит корень линейного уравнения ax + b = 0"

        Scanner in= new Scanner(System.in);
        System.out.println("Введите a, b:");
        int a = in.nextInt(), b = in.nextInt();
        int x=-b/a;
        System.out.println("x "+"= "+x);
    }
}
