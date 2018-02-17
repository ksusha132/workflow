package workflow.enitities;


import org.junit.Test;
import workflow.entities.Document;
import workflow.entities.DocumentKind;
import workflow.entities.UserDocument;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class DocumentTest {

    @Test
    public void testSetId() {
        Document document = new Document();
        document.setId(1L);
        assertNotNull(document.getId());
        assertSame(1L, document.getId());
    }

    @Test
    public void testSetLink() {
        Document document = new Document();
        document.setLink("link");
        assertNotNull(document.getLink());
        assertSame("link", document.getLink());
    }

//    @Test
//    public void setDateTest() {
//        Document document = new Document();
//        document.setCreatingDate(2018-01-01);
//        assertNotNull(document.getLink());
//        assertSame("link", document.getLink());
//    }


    @Test
    public void testSetDocumentKinds() {
        DocumentKind dk = new DocumentKind();
        dk.setId(1L);

        List<DocumentKind> documentKindList = new ArrayList<>();
        documentKindList.add(dk);

        Document document = new Document();
        document.setDocumentKinds(documentKindList);

        assertNotNull(document.getDocumentKinds());
        assertSame(documentKindList, document.getDocumentKinds());
    }

    @Test
    public void testSetUserDocuments() {
        UserDocument ud = new UserDocument();
        ud.setId(1L);

        List<UserDocument> userDocuments = new ArrayList<>();
        userDocuments.add(ud);

        Document document = new Document();
        document.setUserDocuments(userDocuments);

        assertNotNull(document.getUserDocuments());
        assertSame(userDocuments, document.getUserDocuments());
    }

}
