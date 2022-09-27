public class Pentagon extends Shape{
    public Pentagon(Color c){
        super(c);
    }

    @Override
    public void appllyColor() {
        System.out.println("Pentagon filled with color");
        color.applyColor();
    }
}
