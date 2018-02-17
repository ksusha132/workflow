package workflow.enitities;

import org.junit.Test;
import workflow.entities.Client;
import workflow.entities.Document;
import workflow.entities.UserDocument;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class UserDocumentTest {

    @Test
    public void testSetId() {
        UserDocument ud = new UserDocument();
        ud.setId(1L);

        assertNotNull(ud.getId());
        assertSame(1L, ud.getId());
    }

    @Test
    public void testSetClient() {
        UserDocument ud = new UserDocument();
        Client client = new Client();
        ud.setClient(client);

        assertNotNull(ud.getClient());
        assertSame(client, ud.getClient());
    }

    @Test
    public void testSetDocument() {
        UserDocument ud = new UserDocument();
        Document document = new Document();
        ud.setDocument(document);

        assertNotNull(ud.getDocument());
        assertSame(document, ud.getDocument());

    }

}
