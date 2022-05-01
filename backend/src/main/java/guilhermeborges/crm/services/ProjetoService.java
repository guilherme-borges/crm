package guilhermeborges.crm.services;

import guilhermeborges.crm.models.Projeto;
import guilhermeborges.crm.repositories.ProjetoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjetoService {

    private ProjetoRepository projetoRepository;

    public Projeto salvar(Projeto projeto) {
        return projetoRepository.save(projeto);
    }

    public List<Projeto> buscarTodos() {
        return projetoRepository.findAll();
    }
}
