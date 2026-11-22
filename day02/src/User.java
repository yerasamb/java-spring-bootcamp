import java.util.Objects;

public class User {
    private final String name;
    private final String email;
    private final int age;

    public User(String name, String email, int age) {
        if (age < 0){
            throw new IllegalArgumentException("age < 0: " + age);
        }
        this.name = Objects.requireNonNull(name, "name is null");
        this.email = Objects.requireNonNull(email, "email is null");
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public int getAge(){
        return this.age;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && name.equals(user.name) && email.equals(user.email);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

}
