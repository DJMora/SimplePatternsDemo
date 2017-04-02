import com.patterndemo.entities.Shape;
import com.patterndemo.entities.Square;
import com.patterndemo.entities.Triangle;

public class Main {

    public static void main(String[] args){
        Shape triangle = new Triangle(4.0,4.0);
        Shape square = new Square(3.0);

        triangle.displayShapeInfo(triangle);
        square.displayShapeInfo(square);
    }
}
