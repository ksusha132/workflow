package workflow.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import workflow.dto.ClientDTO;
import workflow.dto.ClientOutDTO;
import workflow.dto.IdDTO;
import workflow.entities.Client;
import workflow.entities.UserDocument;
import workflow.repositories.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public Client create(ClientDTO clientDTO) {
        Client client = new Client();

        client.setName(clientDTO.getName());
        client.setEmail(clientDTO.getEmail());
        client.setPassword(clientDTO.getPassword());
        client.setRole("USER_ROLE");

        return userRepository.save(client);
    }

    @Override
    public Client update(ClientDTO clientDTO) {
        Client client = userRepository.findByEmail(clientDTO.getEmail());

        client.setPassword(clientDTO.getPassword());
        client.setName(clientDTO.getName());

        return userRepository.save(client);
    }

    @Override
    public void delete(IdDTO idDTO) {
        userRepository.delete(idDTO.getId());
    }

    @Override
    public void addDocument() {

    }

    @Override
    public List<UserDocument> getAllDocuments(IdDTO idDTO) {
        Client client = userRepository.findOne(idDTO.getId());

        return client.getUserDocuments();
    }

    @Override
    public ClientOutDTO getUser(IdDTO idDTO) {
        ClientOutDTO clientOutDTO = new ClientOutDTO();
        Client client = userRepository.findOne(idDTO.getId());

        clientOutDTO.setEmail(client.getEmail());
        clientOutDTO.setName(client.getName());

        return clientOutDTO;
    }

    @Override
    public List<Client> getAllUsers() {

        return userRepository.findAll();
    }
}

