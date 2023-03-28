package factoryPattern;

public class ShapeFactory {
    public static Shape createShape(String shapeType){
        if (shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        return null;
    }
}
