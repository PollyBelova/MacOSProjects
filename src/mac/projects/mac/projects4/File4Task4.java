package mac.projects.mac.projects4;

import java.util.Scanner;

public class File4Task4 {

    public static void main(String[] args) {

        //4е задание, в котором нужно реализовать калькулятор

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.println("Выберите операцию: ");
        System.out.println("1)a+b");
        System.out.println("2)a-b");
        System.out.println("3)a*b");
        System.out.println("4)a/b");
        System.out.println("5)a%b");

        int op = scanner.nextInt();

        System.out.print("Ответ = ");
        switch (op){
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1*num2);
                break;
            case 4:
                if (num1 == 0 || num2 == 0){
                    System.out.println("Делить на ноль нельзя");
                    break;}
                else {
                    System.out.println(num1/num2);
                    break;
                }
            case 5:
                if (num1 == 0 || num2 == 0){
                    System.out.println("Делить на ноль нельзя");
                    break;}
                else {
                    System.out.println(num1%num2);
                    break;
                }
        }

    }
}
