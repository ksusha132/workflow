package workflow.enitities;

import org.junit.Test;
import workflow.entities.Client;
import static org.junit.Assert.*;


public class ClientTest {

    @Test
    public void testSetId(){
        Client client = new Client();
        client.setId(1L);
        assertNotNull(client.getId());
        assertSame(1L, client.getId());
    }

    @Test
    public void testGetId(){
        Client client = new Client();
        client.setId(1L);
        assertNotNull(client.getId());
        assertSame(1L, client.getId());
    }

}
