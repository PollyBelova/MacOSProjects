package mac.projects.mac.projects2;


import java.util.Scanner;

public class File2Task1 {

    //Ввести с клавиатуры два 3-значных числа и поменять у них
    //средние цифры (например, ввести 357 и 702 – получить и вывести
    //числа 307 и 752

    public static void main(String args[]) {
        int a, b, tempa, tempb;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два числа: ");

        a = scan.nextInt();
        b = scan.nextInt();

        tempa = a % 100 - a % 10;
        tempb = b % 100 - b % 10;

        a += tempb - tempa;
        b += tempa - tempb;

        System.out.println(a);
        System.out.println(b);
    }
}