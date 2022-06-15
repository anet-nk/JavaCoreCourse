package HomeworkLesson4;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
        //2. Написать простой класс «Телефонный Справочник»,
        // который хранит в себе список фамилий и телефонных номеров.
        // В этот телефонный справочник с помощью метода add() можно добавлять записи,
        // а с помощью метода get() искать номер телефона по фамилии.
        // Следует учесть, что под одной фамилией может быть несколько телефонов
        // (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться
        // все телефоны.

    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        PhoneBook phoneBook1 = new PhoneBook();
        phoneBook1.addPhone("Novikov", "8 911 177 5009");
        phoneBook1.addPhone("Ivanov", "+7 (931) 456-66-84");
        phoneBook1.addPhone("Ivanov", "+7 (988) 565-90-77");
        phoneBook1.addPhone("Guravlev", "+7 (910) 538-60-52");
        System.out.println(phoneBook1.getPhone("Ivanov"));
    }


    public HashMap<String, ArrayList<String>> getPhoneBook() {
        return phoneBook;
    }

    public HashMap<String, ArrayList<String>> addPhone(String surname, String phoneNumber) {
        if (phoneBook.containsKey(surname)) {
            phoneBook.get(surname).add(phoneNumber);
        } else {
            ArrayList<String> phones = new ArrayList<>(1);
            phones.add(phoneNumber);
            phoneBook.put(surname, phones);
        }
        return phoneBook;
    }

    public ArrayList<String> getPhone(String surname) {
        return phoneBook.get(surname);
    }
}

