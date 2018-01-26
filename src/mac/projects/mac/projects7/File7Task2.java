package mac.projects.mac.projects7;

public class File7Task2 {

    public static void main(String[] args) {

        // Вывести на экран таблицу умножения (таблицу Пифагора).

        System.out.println();

        for (int x = 1; x < 10; x++) {
            for (int y = 1; y < 10; y++) {
                System.out.print(y + "*" + x + "=" + (x * y) + " " + " \t ");

            }
            System.out.println();

        }
    }

}

