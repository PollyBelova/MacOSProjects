package mac.projects.mac.GeometricFigures;

public class Rectangle {

        public static void main (String[] args) {
            int x, y;
            x = 20;
            y = 10;
            int perimeter = Per (x, y);
            int square = Squ (x, y);
            System.out.println ("Периметр прямоугольника равен " + perimeter + " cm.");
            System.out.println ("Площадь прямоугольника равна " + square + " cm.");
        }

        public static int Per (int x1, int y1) {
            int per = 2 * (x1 + y1);
            return per;
        }

        public static int Squ (int x2, int y2) {
            int squ = x2 * y2;
            return squ;
        }
}


