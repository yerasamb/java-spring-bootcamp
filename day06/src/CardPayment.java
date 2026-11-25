final class CardPayment implements Payment{
    double balance;
    CardPayment(double balance){
        this.balance = balance;
    }

    @Override
    public String name(){
        return "Карта";
    }

    @Override
    public boolean pay(double amount){
        if(amount <= 0) throw new IllegalArgumentException("Сумма должна быть больше нули");
        return !(balance < amount);
    }
}
