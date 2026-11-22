import java.util.Objects;

public class FixedUser {
    String name;
    String email;

    public FixedUser(String name,String email){
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FixedUser that = (FixedUser) o;
        return Objects.equals(name, that.name) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, email);
    }
}
