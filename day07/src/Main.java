public class Main {
    public static void main(String[] args) {
        Order order1 = new Order();
        Order order2 = new Order();
        System.out.println(Order.getCounter());

        System.out.println(order1);
        order1.moveTo(OrderStatus.PAID);
        System.out.println(order1);
        order1.moveTo(OrderStatus.SHIPPED);
        System.out.println(order1);
        order1.moveTo(OrderStatus.DELIVERED);
        System.out.println(order1);

        order2.moveTo(OrderStatus.CANCELLED);
        try{
            order2.moveTo(OrderStatus.PAID);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


    try{
        order1.moveTo(OrderStatus.CANCELLED);
    }catch (IllegalArgumentException e){
        System.out.println(e.getMessage());
    }


    for(OrderStatus i : OrderStatus.values()){
        for(OrderStatus next : OrderStatus.values())
            System.out.println(i.canMoveTo(next));
    }


        System.out.println(OrderStatus.valueOf("PAID"));

    try{
        System.out.println(OrderStatus.valueOf("paid"));
    }catch (IllegalArgumentException e){
        System.out.println(e.getMessage());
    }
    }
}