sealed interface Payment permits CardPayment, CashPayment, KaspiPayment {
    String name();
    boolean pay(double amount);
    default String receipt(double amount){
        return "Оплачено " + amount + " через " + name();
    }
}
