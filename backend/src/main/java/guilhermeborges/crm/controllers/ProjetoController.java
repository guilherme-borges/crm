package guilhermeborges.crm.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }
}
