package mac.projects.mac.projects1;

import java.util.Scanner;

public class File1Task3 {

        public static void main(String[] args) {

            //"Дано целое число n. Выведите следующее за ним четное число"

            Scanner in= new Scanner(System.in);
            System.out.println("Введите целое число");
            int x=in.nextInt();
            int y=x+2-x%2;
            System.out.println("Следующее за ним четное число "+"= "+y);
        }
    }



