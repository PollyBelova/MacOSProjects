package mac.projects.mac.projects3;


import java.util.Scanner;


public class File3Task1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Марафонец прошел S километров со скоростью V метров в секунду (расстояние и скорость вводятся с клавиатуры).
        // Определить, сколько времени он был в пути (часов, минут, секунд)?

         System.out.println("Введите расстояние, пройденное марафонцем (км): ");

        int S = in.nextInt();

        System.out.println("Введите скорость марафонца (м/с): ");

        int V = in.nextInt();
        int sec = S * 1000 / V;
        int h = (sec / (60 * 60)) % 24;
        int m = (sec / 60) % 60;
        int s = sec % 60;

        System.out.println("Марафонец был в пути:");
        System.out.println("Часов: " + h);
        System.out.println("Минут: " + m);
        System.out.println("Секунд: " + s);



    }
}
