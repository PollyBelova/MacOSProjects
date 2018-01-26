package mac.projects.mac.GeometricFigures;

public class Rhombus {

    public static void main (String[] args) {
        int a, h;
        a = 10;
        h = 7;
        int perimeter = Perimeter (a);
        int square = Parallelogram.Square (a, h);
        System.out.println ("Периметр ромба равен " + perimeter + " см.");
        System.out.println ("Площадь ромба равна " + square + " см.");
    }

    public static int Perimeter (int a1) {
        int Per = 4 * a1;
        return Per;
    }
}
