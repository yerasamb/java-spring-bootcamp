import java.util.Objects;

public class PhoneNumber {
    private final String digits;

    public PhoneNumber(String digits){
        String cleaned = digits.replaceAll("\\D","");
        String newNumber = "";
        if(cleaned.length() != 11) throw new IllegalArgumentException("incorrect number");
        if(cleaned.charAt(0) == '8') {
            newNumber += "7";
            newNumber += cleaned.substring(1,cleaned.length());
        }else{
            newNumber = cleaned;
        }
        this.digits = newNumber;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return Objects.equals(digits, that.digits);
    }

    @Override
    public int hashCode(){
        return Objects.hash(digits);
    }

    @Override
    public String toString() {
        return "+" + digits;
    }
}
