package controller;

import jakarta.validation.constraints.Positive;
import livros.Interfacelivros;
import livros.livrosjpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import record.cadastrolivro;

@RestController
@RequestMapping("/bibliotech")
public class Controller {

    @Autowired
    private Interfacelivros Repository;

    @PostMapping
    public void cadastrarlivro(@RequestBody cadastrolivro livro) {
        Repository.save(new livrosjpa(livro));
    }


}
