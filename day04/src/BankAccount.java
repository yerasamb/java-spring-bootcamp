public class BankAccount {
    private final String owner;
    private long balance;

    public BankAccount(String owner){
        this(owner,0);
    }

    public BankAccount(String owner,long initialBalance){
        if(owner == null || owner.trim().isEmpty()) {
            throw new IllegalArgumentException("Не может быть пустым.");
        }
        if(initialBalance < 0 ) throw new IllegalArgumentException("Не может быть меньше или ровно нулю");

        this.owner = owner.trim();

        this.balance = initialBalance;
    }


    public void deposit(long amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Не может быть меньше или ровно нулю");
        }

        balance += amount;
    }

    public void withdraw(long amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Не может быть меньше или ровно нулю");
        }
        if(amount > balance){
            throw new IllegalStateException("Недостаточно средств");
        }

        balance -= amount;
    }

    public void transferTo(BankAccount target,long amount){
        if(target == null) throw new IllegalArgumentException("Счет не может быть пустым");
        if(target == this) throw new IllegalArgumentException("Невозможно сделать перевод самому себе");
        this.withdraw(amount);
        target.deposit(amount);



    }

    public String getOwner(){
        return owner;
    }

    public long getBalance(){
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }
}
