package workflow.enitities;

import org.junit.Test;
import workflow.entities.Document;
import workflow.entities.DocumentKind;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class DocumentKindTest {

    @Test
    public void setIdTest() {
        DocumentKind dk = new DocumentKind();
        dk.setId(1L);
        assertNotNull(dk.getId());
        assertSame(1L, dk.getId());
    }

    @Test
    public void setKind() {
        DocumentKind dk = new DocumentKind();
        dk.setKind("PDF");

        assertNotNull(dk.getKind());
        assertSame("PDF", dk.getKind());
    }

    @Test
    public void setDocument() {
        DocumentKind dk = new DocumentKind();
        Document document = new Document();
        dk.setDocument(document);

        assertNotNull(dk.getDocument());
        assertSame(document, dk.getDocument());
    }

}

