package mac.projects.mac.projects3;


import java.util.Scanner;


public class File3Task4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        /* Пользователь вводит с клавиатуры массу в тоннах (дробное число).
         Вывести по отдельности количество тонн, килограмм, грамм
        например, ввести 126.456789т - получить и вывести 126т 456кг 789г.*/


        System.out.println("Введите массу в тоннах (дробное число): ");
        double m = in.nextDouble();

        int t = (int) m;
        double kg1 = (m - t) * 1000;
        int kg = (int) kg1;
        double g1 = (kg1 - kg) * 1000;
        int g = (int) g1;
        System.out.print("Итого, в введенной массе: ");
        System.out.print(t + " тонн, ");
        System.out.print(kg + " килограмм ");
        System.out.print("и " + g + " грамм ");


    }
}
