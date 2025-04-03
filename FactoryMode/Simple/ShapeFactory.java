package Simple;

/**
 * @Classname ShapeFactory
 * @Description TODO
 * @Date 2025/4/3 20:21
 * @Created by Song zuo gang
 */
public class ShapeFactory {


    public Shape getShape(String shapeName){
        if(shapeName.equalsIgnoreCase("Circle")){
            return new CircleShape();
        } else if (shapeName.equalsIgnoreCase("Rectangle")) {
            return new RectangleShape();
        }else if (shapeName.equalsIgnoreCase("Square")) {
            return new SquareShape();
        }else{
            return null;
        }
    }



}
