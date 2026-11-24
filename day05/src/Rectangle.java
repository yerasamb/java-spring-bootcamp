public class Rectangle extends Shape{
    private final double width;
    private final double height;

    public Rectangle(double width,double height){
       this("Прямоугольник",width,height);
    }

    protected Rectangle(String name,double width,double height){
        super(name);
        if( width <= 0 || height <= 0 ) throw new IllegalArgumentException("Параметры должны быть больше нуля");
        this.width = width;
        this.height = height;

    }
    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    @Override
    double area(){
        return width * height;
    }

    @Override
    double perimeter(){
        return 2 * (width + height);
    }
}
