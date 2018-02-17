package workflow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import workflow.entities.Client;

public interface UserRepository extends JpaRepository<Client, Long> {
}
