import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Point p1 = new Point(1,2);
        Point p2 = new Point(2,1);
        Point p1Clone = new Point(1,2);
        System.out.println("Equals: " + p1.equals(p2));
        System.out.println("Equals: " + p1.equals(p1Clone));

        System.out.println("hash p1 = " + p1.hashCode() + " " + "hash p2 = " + p2.hashCode());
        System.out.println("hash p1 = " + p1.hashCode() + " " + "hash p1Clone = " + p1Clone.hashCode());

        Map<Point, String> myMap = new HashMap<>();
        myMap.put(new Point(1,2),"A");
        System.out.println(myMap.get(new Point(1,2)));


        Map<Point,String> broken = new HashMap<>();
        Point key = new Point(1,2);
        broken.put(key,"B");
        key.x = 10;
        System.out.println(broken.get(key));
        System.out.println(broken.containsKey(key));
        System.out.println(broken.size());

//        1. Почему get() вернул null, хотя size() == 1:
//        Потому что get() пошел искать другой hashCode() и не нашел совпадающий код поэтому это будет null.
//        2. Почему x + y — плохой hashCode:
//        Потому что если мы откроем объект с 1,2 то это будет 3
//        затем откроем еще один объект с 2,1 то это тоже будет 3 и это станет коллизией
//        3. Почему ключ HashMap должен быть неизменяемым:
//        Потому что если изменить хэшмэп то и хэшкод будет
//        менятся но старый хэшкод остается на пут() и это станет ловушкой
    }
}
