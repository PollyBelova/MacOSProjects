package mac.projects.mac.projects1;

import java.util.Scanner;

public class File1Task8 {

    public static void main(String[] args) {

       //Программа  предлагает возможность ввести  количество рублей, и переводит их в доллары и евро

        Scanner in= new Scanner(System.in);
        System.out.print("Введите количество рублей: ");
        double r =in.nextDouble();
        double s = r*58.5;
        System.out.println("Доллары: " + s);
        double e = r*75.5;
        System.out.println("Евро: " + e);
    }
}
