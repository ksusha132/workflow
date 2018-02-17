package workflow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import workflow.entities.UserDocument;

public interface UserDocumentRepository extends JpaRepository<UserDocument, Long> {
}
