package guilhermeborges.crm.controllers;

import guilhermeborges.crm.models.Projeto;
import guilhermeborges.crm.services.ProjetoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projetos")
@AllArgsConstructor
public class ProjetoController {

    private ProjetoService projetoService;

    @PostMapping
    public Projeto salvar(@RequestBody Projeto projeto) {
        return projetoService.salvar(projeto);
    }

    @GetMapping
    public List<Projeto> buscarTodos() {
        return projetoService.buscarTodos();
    }

}
