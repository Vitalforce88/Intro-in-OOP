import java.util.*;

public class Program {

    // static double distance(Point2D a, Point2D b){
    //     return Math.sqrt(Math.pow(a.getX() - b.getX(),2) * Math.pow(a.getY() - b.getY(),2));
    // }
    // перегрузка функции distance:
    static double distance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x1 - x2,2) * Math.pow(y1 - y2,2));
    }
    public static void main(String[] args) {

        Point2D a = new Point2D(0,3);
        Point2D b = new Point2D(0);
        System.out.println(a.toString()); // метод ToString в классе ПЕРЕОПРЕДЕЛЁН
        System.out.println(b.toString());
        var dis = Point2D.distance(a,b);
        System.out.printf("Distance: %.2f",dis);
    }
}
