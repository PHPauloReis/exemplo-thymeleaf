package br.edu.unime.demo.controller;

import br.edu.unime.demo.model.Tarefa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HelloController {

    @GetMapping()
    public String primeiraPagina(Model model) {
        List<Tarefa> lista = List.of(
                new Tarefa("Fazer compras", true),
                new Tarefa("Estudar para a prova", true),
                new Tarefa("Limpar a casa", true),
                new Tarefa("Pagar contas", false),
                new Tarefa("Ligar para o cliente", true),
                new Tarefa("Estudar Java", true)
        );
        model.addAttribute("tarefas", lista);

        return "minhaPagina";
    }

}
