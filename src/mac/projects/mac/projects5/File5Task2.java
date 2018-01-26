package mac.projects.mac.projects5;

import java.util.Scanner;
import java.util.Locale;

public class File5Task2 {

    public static void main(String[] args) {

        // Проверить, имеет ли введеное число вещественную часть.
        //Например, числа 3.14 и 2.5 - имеют вещественную часть, а числа 5 и 10.0 - нет.

        System.out.println("Введите число: ");
        Scanner scInp = new Scanner(System.in).useLocale(Locale.UK);

        double r = scInp.nextDouble();
        int f= (int) r;
        double t = r % f ;
        //System.out.println(r);
        //System.out.println(t);
        String a= "Число имеет вещественную часть";
        String b="у числа нет вещественной части";
        System.out.println(((t>0)&&(t<1))?a:b);
    }

}

