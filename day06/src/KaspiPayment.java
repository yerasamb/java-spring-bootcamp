final class KaspiPayment implements Payment{
    double balance;
    KaspiPayment(double balance){
        this.balance = balance;
    }

    @Override
    public String name(){
        return "Kaspi";
    }

    @Override
    public boolean pay(double amount){
        if(amount <= 0) throw new IllegalArgumentException("Сумма должна быть больше нули");
        if(amount > 500000 ){
            System.out.println("Отказано: Лимит");
            return false;
        }
        if(amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
