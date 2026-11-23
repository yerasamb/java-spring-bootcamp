

public class Main {
    public static void main(String[] args) {
        BankAccount a = new BankAccount("  Ерасыл  ", 1000);
        System.out.println(a);
        BankAccount b = new BankAccount("Айгерим");
        System.out.println(b);


        a.deposit(500);
        System.out.println(a);
        try{
            a.withdraw(2000);
        }catch (IllegalStateException e){
            System.out.println("Ошибка: " + e.getMessage() + "\n У вас на счету: " + a.getBalance());
        }

        try{
            a.deposit(-100);
        }catch (IllegalArgumentException e){
            System.out.println("Ошибка: " + e.getMessage());
        }
        a.transferTo(b,700);
        System.out.println(a.getBalance());
        System.out.println(b.getBalance());

        try{
            a.transferTo(b,5000);
        }catch (IllegalStateException e){
            System.out.println("Ошибка: " + e.getMessage() + "\n У вас на счету: " + a.getBalance()
                    + "\n На счету получателя: " + b.getBalance());
        }

        try{
            a.transferTo(a,100);
        }catch (IllegalArgumentException e){
            System.out.println("Ошибка: " + e.getMessage());
        }

        try{
            BankAccount broke = new BankAccount("   ", 100);
            System.out.println(broke);
        }catch (IllegalArgumentException e){
            System.out.println("Ошибка: " + e.getMessage());
        }


    }
}