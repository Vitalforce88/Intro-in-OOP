import java.math.*;;
/**
     * Это точка на координатах [x,y]
     */
public class Point2D {

    private int x, y;
    /**
     * Конструктор с двумя параметрами:
     * @param X - x координата
     * @param Y - y координата
     */
    public Point2D(int X, int Y) {
        x = X;
        y = Y;
    }
        // для равных значений:
        public Point2D( int equalValue) {
            this(equalValue, equalValue);
        }
        // public Point2D(int equalValues) {
        //     x = equalValues;
        //     y = equalValues;
        // }

    /**Конструктор по умолчанию:*/
    public Point2D() {     
        this(0); // DRY - Do not repeat yourself используем уже имеющийся конструктор при помощи this()
    }
    // public Point2D() {
    //     x = 0;
    //     y = 0;
    // }



    // Спецификатор доступа private Не даёт пользовательскому коду использовать метод напрямую
    private String getCoordinate(){ 
        return String.format("Point[%d,%d]",x,y);
    }
    // ПЕРЕОПРЕДЕЛЕНИЕ(Не перегрузка! пометка @override)
    @Override
    public String toString() {
        return getCoordinate();
    }
    // get функции для координат, т.к они также private:
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public static double distance(Point2D a, Point2D b){
        return Math.sqrt(Math.pow(a.x - b.x,2) + Math.pow(a.y - b.y,2));
    }
}
