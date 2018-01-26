package mac.projects.mac.projects1;

import java.util.Scanner;
public class File1Task7 {

    public static void main(String[] args) {

        //Программа  предлагает ввести радиус окружности, а затем считает площадь и длину этой окружности

        Scanner in= new Scanner(System.in);
        System.out.print("Введите радиус: ");
        double r =in.nextDouble();

        //Площадь круга
        double p = Math.PI*(r*r);
        System.out.println("Площадь круга равна: " + p);

        //Длина окружности
        double d = Math.PI*2*r;
        System.out.println("Длина окружности равна: " + d);
    }
}
