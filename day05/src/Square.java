public class Square extends Rectangle{
    private final double side;
    Square(double side){
        super("Квадрат",side,side);
        this.side = side;
    }


    public double getSide() {
        return side;
    }


}
