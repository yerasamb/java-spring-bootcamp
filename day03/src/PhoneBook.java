import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private final Map<PhoneNumber,String> contacts = new HashMap<>();

        boolean add(String name, String phone){

            PhoneNumber number = new PhoneNumber(phone);
            if(contacts.containsKey(number)){
                return false;
            }
            contacts.put(number, name);
            return true;

    }


    String findName(String phone){
        PhoneNumber numbers = new PhoneNumber(phone);
        if(contacts.get(numbers) != null) return contacts.get(numbers);
        return null;
    }

    boolean remove(String phone){
        PhoneNumber number = new PhoneNumber(phone);
        return contacts.remove(number) != null;
    }

    List<PhoneNumber> findByName(String name){
        List<PhoneNumber> result = new ArrayList<>();
        for(Map.Entry<PhoneNumber,String> entry : contacts.entrySet()){
            PhoneNumber number = entry.getKey();
            String n = entry.getValue();
            if(name.equals(n)){
                result.add(number);
            }
        }
        return result;
    }

    void printAll(){
            if(contacts.isEmpty()){
                System.out.println("Книга пуста");
            }else{
                for(Map.Entry<PhoneNumber,String> entry : contacts.entrySet()){
                    System.out.println("Name: " + entry.getValue() + "\n" + "Number: " + entry.getKey());
                }
            }
    }
}
