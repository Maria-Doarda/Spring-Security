package com.example.departamento.controllers;

import com.example.departamento.models.DepartamentoModel;
import com.example.departamento.services.DepartamentoService;
import meufoslfnapovfhjau.demo.models.PessoaModel;
import meufoslfnapovfhjau.demo.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/pessoas)
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    public ResponseEntity<PessoaModel> criarPessoa(@RequestBody PessoaModel pessoaModel){
        PessoaModel request = pessoaService.criarPessoa(pessoaModel);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(pessoaModel).toUri();
        return ResponseEntity.created(uri).body(request);
    }

    @GetMapping
    public ResponseEntity<List<PessoaModel>> findAll(){
        List<PessoaModel> request = pessoaService.findAll();
        return ResponseEntity.ok().body(request);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        pessoaService.deletar(id);
    }
}
