package promyze.contacts;

import static spark.Spark.get;
import static spark.Spark.port;

public class Main {

    public static void main(String[] args) {
        ContactHandler contactHandler = new ContactHandler();

        port(5000);

        get("/addContact", (req, res) -> {
            String name = req.queryMap().get("name").value();
            int age = req.queryMap().get("age").integerValue();
            contactHandler.addContact(name, age);
            return "Contact added Successfully";
        });

        get("/contacts", (req, res) -> "Contacts : " + contactHandler.getContacts());

        get("/removeContact", (req, res) -> {
            String name = req.queryMap().get("name").value();
            return contactHandler.removeContact(name);
        });
    }

}
