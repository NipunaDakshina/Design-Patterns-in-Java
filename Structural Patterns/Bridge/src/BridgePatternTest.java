public class BridgePatternTest {
    public static void main(String[] args) {
        Shape tri=new Triangle(new RedColor());
        tri.appllyColor();

        Shape pent=new Pentagon(new GreenColor());
        pent.appllyColor();
    }
}
