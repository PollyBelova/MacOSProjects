package mac.projects.mac.projects4;

import java.util.Scanner;

public class File4Task3 {

    //Ввести число, и выяснить - положительное оно, отрицательное ,или равно нулю?

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        if (num > 0){
            System.out.println("Чсло положительное");
        }else {
            System.out.println("Число отрицательное");
        }

        if (num == 0)
            System.out.println("Число равно нулю");
    }
    }


