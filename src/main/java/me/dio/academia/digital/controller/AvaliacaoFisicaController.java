package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.service.impl.AvaliacaoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {
    @Autowired
    AvaliacaoServiceImpl avaliacaoService;

    @PostMapping
    public AvaliacaoFisica created( AvaliacaoFisicaForm form ){
    return  avaliacaoService.create(form);
    }

    @GetMapping
    public List<AvaliacaoFisica> get( ){
    return  avaliacaoService.getAll();
    }
}
