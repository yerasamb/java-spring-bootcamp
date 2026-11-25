import java.util.List;

public class Main {
    static String describe(Payment p){
        return switch (p){
            case CardPayment c -> "Это карта";
            case CashPayment c -> "Это наличка";
            case KaspiPayment c -> "Это Каспи";
        };
    }
    public static void main(String[] args) {
        List<Payment> variety = List.of(
                new CardPayment(50000),
                new CashPayment(5000),
                new KaspiPayment(1000000)
        );

        for(Payment i : variety){
            if(i.pay(10000)){
                System.out.println(i.receipt(10000));
            }else{
                System.out.println("Отказ: " + i.name());
            }
        }

        KaspiPayment a;
        a = (KaspiPayment) variety.get(2);
        a.pay(600000);

        for(Payment i : variety){
            try{
                i.pay(-5);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

        for(Payment i : variety){
            System.out.println(describe(i));
        }
    }
}

//Payment interface потому что это «что умеешь» (способность, контракт) а не «кто ты» (общий предок)