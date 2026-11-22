import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        List<String> roles = new ArrayList<>();
        roles.add("Admin");
        roles.add("User");
        UserRecord userRecord = new UserRecord("Yeras","ee@gamil.com",18,roles);
        System.out.println(userRecord.roles());
        try{
            userRecord.roles().add("PreUser");
        }catch (Exception e){
            System.out.println("Ошибка: " + e.getClass().getSimpleName());
        }

        System.out.println(userRecord.roles());

        Set<BrokenUser> check = new HashSet<>();
        BrokenUser bk1 = new BrokenUser("Yeras","ee@gmail.com");
        BrokenUser bk2 = new BrokenUser("Yeras","ee@gmail.com");
        check.add(bk1);
        check.add(bk2);
        System.out.println("Перегрузка: " + check.size());

        Set<FixedUser> check2 = new HashSet<>();
        FixedUser f1 = new FixedUser("Yeras","ee@gmail.com");
        FixedUser f2 = new FixedUser("Yeras","ee@gmail.com");
        check2.add(f1);
        check2.add(f2);
        System.out.println("Переопределение: " + check2.size());

    }
}

// Exception: Unsupported Operations Exception
// list.copyof creates unchangeable variables

//about hashset: HashSet ищет equals(Object), мой метод не видит