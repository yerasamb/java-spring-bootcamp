public class Square extends Rectangle{
    private final double side;
    Square(double side){
        super("Квадрат",side,side);
        this.side = side;
    }


    public double getSide() {
        return side;
    }

    @Override
    double area(){
        return Math.pow(side,2);
    }

    @Override
    double perimeter(){
        return 4 * side;
    }
}
