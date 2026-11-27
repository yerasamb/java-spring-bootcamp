import java.util.List;

public class StringTasks {
    boolean isPalindrome(String s){
        if(s == null) {
            return false;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);

            if(Character.isLetterOrDigit(c)){
                c = Character.toLowerCase(c);
                sb.append(c);
            }
        }
        s = sb.toString();
        String reverseInString = sb.reverse().toString();

        return s.equals(reverseInString);
    }

    int countWords(String s){
        if(s == null || s.isBlank() || s.trim().isBlank()) {
            return 0;
        }
        s = s.trim();
        List<String> ls = List.of(s.split("\\s+"));
        return ls.size();
    }

}
