public class Circle extends Shape{
    private final double radius;
    public Circle(double radius){
        super("Круг");
        if(radius <= 0) throw new IllegalArgumentException("Радиус должен быть больше нуля");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    double area(){
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    double perimeter(){
        return 2 * Math.PI * radius;
    }
}
