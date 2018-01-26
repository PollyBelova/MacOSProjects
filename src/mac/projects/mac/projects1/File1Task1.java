package mac.projects.mac.projects1;

import java.util.Scanner;

public class File1Task1 {

    //Ввести натуральное число. Вывести на экран младший разряд числа

    public static void main(String[] args) {
        System.out.println();
        Scanner in= new Scanner(System.in);
        System.out.println("введите натуральное число");
        int x=in.nextInt();
        int y=x%10;
        System.out.println("Младший разряд числа ="+" " + y);
    }
}
