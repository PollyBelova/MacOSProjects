package mac.projects.mac.projects6;

import java.util.Scanner;

public class File6Task3 {

    public static void main(String[] args) {

        // Вычислить сумму чисел в диапазоне от M до N.

    System.out.println("Введите числа M и N: ");
    Scanner in = new Scanner(System.in);
    int m = in.nextInt();
    int n = in.nextInt();
    int s = 0;

        for (int t = m; t <= n; t++) s = s + t;
        System.out.print("Сумма чисел в диапозоне c " + m + " до " + n + " равна " + s);
}
}
