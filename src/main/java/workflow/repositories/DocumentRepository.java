package workflow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import workflow.entities.Document;

public interface DocumentRepository extends JpaRepository<Document, Long>{
}
