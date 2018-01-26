package mac.projects.mac.GeometricFigures;

public class Parallelogram {

    public static void main (String[] args) {
        int a, b, h;
        a = 10;
        b = 20;
        h = 5;
        int perimeter = Perimeter (a, b);
        int square = Square (a, h);
        System.out.println ("Периметр параллелограмма равен " + perimeter + " см.");
        System.out.println ("Площадь параллелограмма равна " + square + " см.");
    }

    public static int Perimeter (int a1, int b1) {
        int Per = 2 * (a1 + b1);
        return Per;
    }

    public static int Square (int a2, int h2) {
        int Squ = a2 * h2;
        return Squ;
    }
}
