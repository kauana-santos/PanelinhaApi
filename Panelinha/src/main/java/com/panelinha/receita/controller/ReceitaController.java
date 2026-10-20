package com.panelinha.receita.controller;

import com.panelinha.receita.dto.ReceitaDto;
import com.panelinha.receita.dto.ReceitaResponseDto;
import com.panelinha.receita.service.ReceitaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/receitas")
public class ReceitaController {
    private final ReceitaService receitaService;

    public ReceitaController(ReceitaService receitaService) {
        this.receitaService = receitaService;
    }

    @GetMapping
    public List<ReceitaResponseDto> findall(){
        return receitaService.findAll();
    }

    @GetMapping("/{id}")
    public ReceitaResponseDto findall(@PathVariable Long id){
        return receitaService.findById(id);
    }

    @PostMapping
    public ReceitaResponseDto create(@RequestBody ReceitaDto receitaDto) {
        return receitaService.create(receitaDto);
    }
}
