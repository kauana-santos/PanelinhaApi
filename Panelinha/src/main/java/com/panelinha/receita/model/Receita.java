package com.panelinha.receita.model;

import com.panelinha.ingrediente.model.Ingrediente;
import com.panelinha.modoDePreparo.model.ModoDePreparo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Receita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( nullable = false)
    private String titulo;

    @Column( nullable = false)
    private String descricao;

    @OneToMany(mappedBy = "receita", cascade = CascadeType.ALL)
    private List<Ingrediente> ingredientes = new ArrayList<>();

    @OneToMany(mappedBy = "receita", cascade = CascadeType.ALL)
    @OrderColumn(name = "ordem")
    private List<ModoDePreparo> modoDePreparo = new ArrayList<>();
}
