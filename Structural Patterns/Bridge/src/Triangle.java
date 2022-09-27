public class Triangle extends Shape{
    public Triangle(Color c){
        super(c);
    }

    @Override
    public void appllyColor() {
        System.out.println("Triangle filled with color ");
        color.applyColor();
    }
}
