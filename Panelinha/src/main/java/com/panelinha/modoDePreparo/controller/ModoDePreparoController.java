package com.panelinha.modoDePreparo.controller;

import com.panelinha.modoDePreparo.dto.ModoDePreparoDto;
import com.panelinha.modoDePreparo.dto.ModoDePreparoResponseDto;
import com.panelinha.modoDePreparo.service.ModoDePreparoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/modoDePreparo")
public class ModoDePreparoController {

    private final ModoDePreparoService modoDePreparoService;

    public ModoDePreparoController(ModoDePreparoService modoDePreparoService) {
        this.modoDePreparoService = modoDePreparoService;
    }

    @GetMapping
    public List<ModoDePreparoResponseDto> findAll(){
        return modoDePreparoService.findAll();
    }

    @GetMapping("/{id}")
    public ModoDePreparoResponseDto findById(@PathVariable Long id){
        return modoDePreparoService.finById(id);
    }

    @PostMapping
    public ModoDePreparoResponseDto create(@RequestBody ModoDePreparoDto modoDePreparoDto){
        return modoDePreparoService.create(modoDePreparoDto);
    }
}
