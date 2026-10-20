package com.panelinha.ingrediente.model;

import com.panelinha.receita.model.Receita;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ingrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( nullable = false)
    private String titulo;

    private String descricao;

    @Column( nullable = false)
    private Integer quantidade;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Receita receita;
}