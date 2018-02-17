package workflow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import workflow.entities.DocumentKind;

public interface DocumentKindRepository extends JpaRepository<DocumentKind, Long> {
}
