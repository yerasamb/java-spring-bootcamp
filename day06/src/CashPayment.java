final class CashPayment implements Payment{
    double cash;
    CashPayment(double cash){
        this.cash = cash;
    }

    @Override
    public String name(){
        return "Наличка";
    }

    @Override
    public boolean pay(double amount){
        if(amount <= 0) throw new IllegalArgumentException("Сумма должна быть больше нули");
        if(amount <= cash){
            System.out.println("Сдача: " + (cash - amount));
            return true;
        }
        return false;
    }
}
