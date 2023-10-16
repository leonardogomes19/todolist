package br.com.leonardogomes.todolist.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
public class MinhaPrimeiraController {

    /* 
     * Métodos de acesso do HTTP
     * GET - Buscar uma informação
     * POST - Adicionar uma informação
     * PUT - Alterar uma informação
     * DELETE - Remover um dado
     * PATCH - Alterar uma parte da informação
     */

    // Método (Funcionalidade) de uma classe
    @GetMapping("/primeiroMetodo")
    public String primeiraMensagem(){
        return "Funcionou";
    }
    
}
