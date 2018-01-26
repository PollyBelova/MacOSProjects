package mac.projects.mac.projects7;

import java.util.*;

public class File7Task3 {

    public static void main(String[] args) {

        /* Ежемесячная стипендия студента составляет N рублей, а расходы на проживание превышают стипендию
         и составляют М рублей в месяц. Рост цен ежемесячно увеличивает расходы на 3%. Составьте программу рассчета
         суммы денег, которую необходимо единовременно попросить у родителей, чтобы можно было прожить учебный
         год (10 месяцев), используя только эти деньги и стипендию.
         */

        System.out.println("Введите сумму стипендии студента: ");
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();

        System.out.println("Введите сумму расходов на проживание в месяц: ");

        double m = in.nextDouble();
        for (int i = 1; i <= 10; i++) {

            m = 1.03 * m;
            System.out.printf("На %dй месяц нужно попросить %.2f рублей", i, (m - n));

            System.out.println();


        }
    }
    }



