package mac.projects.mac.projects4;

import java.util.Scanner;

public class File1Task5 {

    public static void main(String[] args) {

        //Ввести с клавиатуры симбол. Определить, чем он является: цифрой, буквой или знаком пунктуации

        System.out.print("Введите симбол: ");
    Scanner scanner = new Scanner(System.in);

    String str = scanner.next();

    char ch = str.charAt(0);

        if (Character.isDigit(ch)) System.out.println("Это цифра");
        else if (Character.isLetter(ch)) System.out.println("Это буква");
        else if ("!?,.:\";-".contains(str)) System.out.println("Это пунктуация");
}
}
