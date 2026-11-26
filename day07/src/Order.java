public class Order {
    private static int counter = 0;
    private final int id;
    private OrderStatus status;

    Order(){
        counter++;
        this.id = 1;
        this.status = OrderStatus.NEW;
    }

    static int getCounter(){
        return counter;
    }
    void moveTo(OrderStatus next){
        if(!status.canMoveTo(next)){
            throw new IllegalArgumentException("Нельзя перейти: " + status + " -> " + next);
        }else{
            status = next;
        }
    }

    @Override
    public String toString() {
        return "Заказ: " + id + " " + status.getTitle();
    }
}
