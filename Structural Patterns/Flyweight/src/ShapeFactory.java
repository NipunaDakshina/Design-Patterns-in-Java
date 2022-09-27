import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<ShapeType,Shape> shapes=new HashMap<ShapeType, Shape>();
    public static Shape getShape(ShapeType type){
        Shape shapeImp1=shapes.get(type);
        if (shapeImp1==null){
            if (type.equals(ShapeType.OVAL_FILL)){
                shapeImp1=new Oval(true);
            }else if (type.equals(ShapeType.OVAL_NOFILL)){
                shapeImp1=new Oval(false);
            } else if (type.equals(ShapeType.LINE)) {
                shapeImp1=new Line();
            }
            shapes.put(type,shapeImp1);
        }
        return shapeImp1;
    }
    public static enum ShapeType{
        OVAL_FILL,OVAL_NOFILL,LINE;
    }
}
