public class Shape {
    private final String name;
    public Shape(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    double area(){
        return 0;
    }

    double perimeter(){
        return 0;
    }

    @Override
    public String toString(){
        return String.format("%s площадь %.2f, периметр %.2f",name,area(),perimeter());
    }
}
