package promyze.contacts;

import static spark.Spark.get;

public class Main {

    public static void main(String[] args) {
        ContactHandler contactHandler = new ContactHandler();

        get("/addContact", (req, res) -> {
            String name = req.queryMap().get("name").value();
            int age = req.queryMap().get("age").integerValue();
            return contactHandler.addContact(name, age);
        });

        get("/contacts", (req, res) -> contactHandler.getContacts());
    }

}
