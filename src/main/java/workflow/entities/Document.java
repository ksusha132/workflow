package workflow.entities;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
public class Document {

    public Document() {
    }

    public Document(String link, Date creatingDate, Date updateDate) {
        this.link = link;
        this.creatingDate = creatingDate;
        this.updateDate = updateDate;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "document", cascade = CascadeType.ALL)
    private List<DocumentKind> documentKinds;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "document", cascade = CascadeType.ALL)
    private List<UserDocument> userDocuments;

    @Id
    @GeneratedValue
    @NotNull
    private Long id;

    @Column
    @NotNull
    private String link;

    @Column
    @NotNull
    private Date creatingDate;

    @Column
    private Date updateDate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Date getCreatingDate() {
        return creatingDate;
    }

    public void setCreatingDate(Date creatingDate) {
        this.creatingDate = creatingDate;
    }

    public List<DocumentKind> getDocumentKinds() {
        return documentKinds;
    }

    public void setDocumentKinds(List<DocumentKind> documentKinds) {
        this.documentKinds = documentKinds;
    }

    public List<UserDocument> getUserDocuments() {
        return userDocuments;
    }

    public void setUserDocuments(List<UserDocument> userDocuments) {
        this.userDocuments = userDocuments;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
