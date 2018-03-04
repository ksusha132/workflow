package workflow.services;

import workflow.dto.ClientDTO;
import workflow.dto.ClientOutDTO;
import workflow.dto.IdDTO;
import workflow.entities.Client;
import workflow.entities.UserDocument;

import java.util.List;

public interface UserService {
    Client create(ClientDTO clientDTO);

    void delete(IdDTO idDTO);

    Client update(ClientDTO clientDTO);

    ClientOutDTO getUser(IdDTO idDTO);

    List<Client> getAllUsers();

    void addDocument();

    List<UserDocument> getAllDocuments(IdDTO idDTO);
}
