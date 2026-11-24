import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(
                new Circle(1),
                new Square(3),
                new Rectangle(2,3)

        );

        for(Shape s : shapes){
            System.out.println(s);
        }

        double sum = 0;
        for(Shape s : shapes){
            sum+=s.area();
        }
        System.out.println(sum);

        double max = 0;
        String res = "";
        for(Shape s : shapes){
            if(max < s.area()){
                 max = s.area();
                res = s.getName();
            }


        }
        System.out.println(res);

        int sum1 = 0;
        for(Shape s : shapes){
            if(s instanceof Circle){
                sum1++;
            }
        }
        System.out.println("В списке кругов: " + sum1);

        Shape s = new Square(3);
        try{
            ((Circle) s).area();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            Circle c1 = new Circle(-1);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try{
            Rectangle r1 = new Rectangle(2,0);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}


//1.потому что мы сделали override() так что он использует метод площади круга
//2.компиляция потому что это не доходит до ран и по дефолту на джаве вызывается
// супер но без параметров так что это будет ошибкой
//3.это полиморфизм он делает всю работу типо у каждого класса правильный метол выводится