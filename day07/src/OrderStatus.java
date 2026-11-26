public enum OrderStatus {
    NEW("Новый"), PAID("Оплачено"),
    SHIPPED("Отправлен"), DELIVERED("Доставлен"), CANCELLED("Отменен");

    private final String translate;

    OrderStatus(String translate){
        this.translate = translate;
    }

    public String getTitle(){
        return translate;
    }

    public boolean canMoveTo(OrderStatus next){
        return switch(this){
            case NEW -> next == PAID || next == CANCELLED;
            case PAID -> next == SHIPPED || next == CANCELLED;
            case SHIPPED -> next == DELIVERED;
            case DELIVERED,CANCELLED -> next == null;
        };
    }

}
