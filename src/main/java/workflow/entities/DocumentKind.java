package workflow.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class DocumentKind {


    @ManyToOne
    private Document document;


    @Id
    @GeneratedValue
    @NotNull
    private Long id;

    @Column
    @NotNull
    private String kind;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}
