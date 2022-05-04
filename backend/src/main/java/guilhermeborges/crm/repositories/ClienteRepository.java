package guilhermeborges.crm.repositories;

import guilhermeborges.crm.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
