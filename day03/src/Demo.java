public class Demo {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        System.out.println("add: " + book.add("Yeras", "+7 747 807 07 10"));
        System.out.println("add: " + book.add("Yeras", "87018273333"));
        System.out.println("add: " + book.add("Nuras", "+7 (777) 000-11-22"));

        System.out.println("add: " + book.add("Yeras", "7 (701) 8273333"));

        System.out.println("findName: " + book.findName("+7 (747) 807-07-10)"));

        System.out.println("findByName: " + book.findByName("Yeras"));

        book.remove("+7 (777) 000-11-22");
        System.out.println("findName: " + book.findName("7 (777) 000-11-22"));

        try{
            System.out.println("add: " + book.add("Raha","7747"));
        }catch (IllegalArgumentException e){
            System.out.println("Неверный номер!!!");
        }

        book.printAll();


    }
}
