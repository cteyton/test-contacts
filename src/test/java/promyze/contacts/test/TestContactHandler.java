package promyze.contacts.test;

import org.junit.Test;
import promyze.contacts.ContactHandler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestContactHandler {

    @Test
    public void testHandler() {
        ContactHandler handler = new ContactHandler();
        assertTrue(handler.getContacts().isEmpty());
        handler.addContact("Luc", 30);
        assertEquals(1, handler.getContacts().size());
    }

}
