package promyze.contacts;

import java.util.ArrayList;
import java.util.List;

public class ContactHandler {

    private List<Contact> contacts = new ArrayList<>();

    public List<Contact> getContacts() {
        return contacts;
    }

    public String addContact(String name, int age) {
        contacts.add(new Contact(name, age));
        return "Contact added Successfully";
    }

}
