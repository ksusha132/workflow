package workflow.services;

import workflow.dto.ClientDTO;
import workflow.dto.IdDTO;
import workflow.entities.Client;
import workflow.entities.Document;

import java.util.List;

public interface UserService {
    Client create(ClientDTO clientDTO);

    void delete(IdDTO idDTO);

    Client update(ClientDTO clientDTO);

    void addDocument();

    List<Document> getAllDocuments();
}
