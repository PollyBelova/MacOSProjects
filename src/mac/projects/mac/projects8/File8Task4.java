package mac.projects.mac.projects8;

import java.util.Scanner;

public class File8Task4 {
    public static void main(String[] args) {

        /* Нужно заполнить значения элементов массива числами последовательности: 4, 7, 10, 3, 16,...
        и вывести получившийся массив на экран.Не будет считаться верным решение, в котором элементы
        последовательности просто выводятся на экран, не попадая в массив. */

        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");

        int i=in.nextInt();

        int x=1;
        int aray[] = new int[i];

        for ( i = 0 ; i < aray.length; i++ )

        {    x+=3;aray[i]=x;
            System.out.print(aray[i]+"\t");
        }

        System.out.println();

    }


}
