import java.util.Objects;

public class BrokenUser {
    String name;
    String email;

    public BrokenUser(String name,String email){
        this.name = name;
        this.email = email;
    }

    public boolean equals(BrokenUser o) {
        if (o == null || getClass() != o.getClass()) return false;
        BrokenUser that = (BrokenUser) o;
        return name.equals(that.name) && email.equals(that.email);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, email);
    }
}
