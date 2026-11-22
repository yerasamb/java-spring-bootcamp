import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1 - добавить, 2 - найти, 3 - удалить, 4 - список, 0 - выход");
            String choice = sc.nextLine().trim();
            if (choice.equals("0")) break;

            try {
                switch (choice) {
                    case "1" -> {
                        System.out.print("Имя: ");
                        String name = sc.nextLine().trim();
                        System.out.print("Номер: ");
                        String phone = sc.nextLine();
                        if (phoneBook.add(name, phone)) {
                            System.out.println("Добавлено.");
                        } else {
                            System.out.println("Такой номер уже есть.");
                        }
                    }
                    case "2" -> {
                        while(true){
                            System.out.println(" 1 - по номеру, 2 - по имени, 0 - выход: ");
                            String chose = sc.nextLine().trim();
                            if(chose.equals("0")) break;

                            switch(chose){
                                case "1" -> {
                                    System.out.println("Введи номер: ");
                                    String number = sc.nextLine().trim();
                                    String name = phoneBook.findName(number);
                                    if(name == null){
                                        System.out.println("Не найдено!!!");
                                    }else {
                                        System.out.println(name);
                                    }
                                }
                                case "2" -> {
                                    System.out.println("Введи имя: ");
                                    String name = sc.nextLine().trim();
                                    List<PhoneNumber> numbers = phoneBook.findByName(name);
                                    if(numbers.isEmpty()){
                                        System.out.println("Не найдено!!!");
                                    }else{
                                        System.out.println(numbers);
                                    }
                                }
                                default -> System.out.println("Выбирай 0–2.");
                            }
                        }
                    }
                    case "3" -> {
                        System.out.print("Номер: ");
                        String phone = sc.nextLine();
                        if(phoneBook.remove(phone)){
                            System.out.println("Номер удален успешно");
                        }else{
                            System.out.println("Такого номера нету");
                        }
                    }
                    case "4" -> phoneBook.printAll();
                    default -> System.out.println("Выбирай 0–4.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
        System.out.println("Пока!");
    }
}