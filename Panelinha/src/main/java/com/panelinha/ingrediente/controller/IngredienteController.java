package com.panelinha.ingrediente.controller;

import com.panelinha.ingrediente.dto.IngredienteDto;
import com.panelinha.ingrediente.dto.IngredienteResponseDto;
import com.panelinha.ingrediente.repository.IngredienteRepository;
import com.panelinha.ingrediente.service.IngredienteService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredientes")
public class IngredienteController {
    private final IngredienteService ingredienteService;

    public IngredienteController(IngredienteService ingredienteService) {
        this.ingredienteService = ingredienteService;
    }

    @GetMapping
    public List<IngredienteResponseDto> findAll(){
        return ingredienteService.findAll();
    }

    @GetMapping("/{id}")
    public IngredienteResponseDto findById(@PathVariable Long id){
        return  ingredienteService.findById(id);
    }

    @PostMapping
    public IngredienteResponseDto create(@RequestBody IngredienteDto ingredienteDto){
        return ingredienteService.create(ingredienteDto);
    }
}
