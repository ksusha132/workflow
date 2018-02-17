package workflow.services;

import workflow.entities.Client;

public interface UserService {
    Client create();

    void delete();

    Client update();
}
