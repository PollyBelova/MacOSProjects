package mac.projects.mac.projects3;

import java.util.Scanner;

public class File3Task5 {

    public static void main(String[] args) {

        /*Пользователь вводит с клавиатуры время в секундах.
        Перевести это значение в дни, часы, минуты и секунды.
        Например, 43512 секунд – это 12 часов, 5 минут и 12 секунд.*/

        Scanner in = new Scanner(System.in);

        System.out.print("Введите время в секундах: ");

        int sec = in.nextInt();
        int d = (sec / (60 * 60 * 24)) % 24;
        int h = (sec / (60 * 60)) % 24;
        int m = (sec / 60) % 60;
        int s = sec % 60;

        System.out.println("Значение в днях, часах, минутах и секундах:");
        System.out.println("Дней: " + d);
        System.out.println("Часов: " + h);
        System.out.println("Минут: " + m);
        System.out.println("Секунд: " + s);

    }
}
