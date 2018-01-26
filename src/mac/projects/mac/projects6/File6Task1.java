package mac.projects.mac.projects6;

import java.util.Scanner;
import java.util.Locale;


public class File6Task1 {

    public static void main(String[] args) {

        // Вывести на экран горизонтальную линию из звездочек. Число звездочек указывает пользователь.

        Scanner in = new Scanner(System.in).useLocale(Locale.UK);

        System.out.println("Введите число звездочек: ");

        int x = in.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.print("*");
        }

    }

}
