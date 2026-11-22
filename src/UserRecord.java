import java.util.List;
import java.util.Objects;

public record UserRecord(String name,String email,int age,List<String> roles) {
    public UserRecord{
        if( age < 0) {
            throw new IllegalArgumentException("Age < 0: " + age);
        }
        Objects.requireNonNull(name,"name is null");
        Objects.requireNonNull(email, "Email is null");
        roles = List.copyOf(roles);
    }
}
