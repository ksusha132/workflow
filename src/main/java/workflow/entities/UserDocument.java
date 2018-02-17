package workflow.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class UserDocument {

    @Id
    @GeneratedValue
    @NotNull
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "id_document", referencedColumnName = "id")
    private Document document;

    //Document

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}
