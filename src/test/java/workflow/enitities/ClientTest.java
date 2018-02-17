package workflow.enitities;

import org.junit.Test;
import workflow.entities.Client;
import workflow.entities.UserDocument;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;


public class ClientTest {

    @Test
    public void testSetId() {
        Client client = new Client();
        client.setId(1L);
        assertNotNull(client.getId());
        assertSame(1L, client.getId());
    }

    @Test
    public void testSetName() {
        Client client = new Client();
        client.setName("Ivan");
        assertNotNull(client.getName());
        assertSame("Ivan", client.getName());
    }

    @Test
    public void testSetEmail() {
        Client c = new Client();
        c.setEmail("test@test.ru");
        assertNotNull(c.getEmail());
        assertSame("test@test.ru", c.getEmail());
    }

    @Test
    public void testSetPassword() {
        Client client = new Client();
        client.setPassword("12345");
        assertNotNull(client.getPassword());
        assertSame("12345", client.getPassword());
    }

    @Test
    public void testSetUserDocuments() {
        Client client = new Client();

        UserDocument ud = new UserDocument();
        ud.setId(1L);
        ud.setClient(client);

        List<UserDocument> userDocuments = new ArrayList<>();
        userDocuments.add(ud);

        client.setUserDocuments(userDocuments);
        assertNotNull(client.getUserDocuments());
        assertSame(userDocuments, client.getUserDocuments());
    }

    @Test
    public void testClient(){
        Client client = new Client("name", "email", "password");
        assertNotNull(client);
        assertSame("name", client.getName());
        assertSame("email", client.getEmail());
        assertSame("password", client.getPassword());
    }

}
