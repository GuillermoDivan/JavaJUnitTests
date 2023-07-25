package Services;
import Entitites.Rectangle;

public class RectangleService {
    public double getPerimeter(Rectangle r){
        return (r.getHeight()*2)+ (r.getWidth()*2);
    }

    public double getArea(Rectangle r){
       return (r.getHeight() * r.getWidth());
    }

}
