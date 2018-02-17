package workflow.services;

import workflow.entities.Document;

public interface DocumentService {
    Document create();

    void delete();

    Document update();
}
