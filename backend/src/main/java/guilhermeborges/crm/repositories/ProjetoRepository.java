package guilhermeborges.crm.repositories;

import guilhermeborges.crm.models.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}
