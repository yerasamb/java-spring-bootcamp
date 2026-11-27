public class Main {
    public static void main(String[] args) {
        StringTasks st = new StringTasks();
        System.out.println(st.isPalindrome("Racecar"));
        System.out.println(st.isPalindrome("А роза упала на лапу Азора" ));
        System.out.println(st.isPalindrome("Was it a car or a cat I saw?"));
        System.out.println(st.isPalindrome("hello"));
        System.out.println(st.isPalindrome(null));


        System.out.println(st.countWords("  Java   is  cool  "));
        System.out.println(st.countWords("   "));
        System.out.println(st.countWords(" "));
        System.out.println(st.countWords(null));
        System.out.println(st.countWords("одно"));


        String s = "";
        StringBuilder sb = new StringBuilder();

        long startTime = System.nanoTime();
        for(int i = 0; i < 50000; i++){
            s = s + "a";
        }

        System.out.println(s);
        long elapsed = System.nanoTime() - startTime;
        System.out.println(elapsed);

        long start = System.nanoTime();
        for(int i = 0; i < 50000; i++){
            sb.append("a");
        }
        System.out.println(sb);
        long elapse = System.nanoTime() - start;
        System.out.println(elapse);

        System.out.println(elapsed - elapse);
    }
}


// потому что String открывает новый объект когда изменяет объект и
// из за этого используется Garbage Collector а он между этим использует процессор так что он замедляется
// а StringBuilder не создает он просто добавляет к концу так что здесь не используется GC