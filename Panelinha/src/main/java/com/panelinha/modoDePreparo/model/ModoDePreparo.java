package com.panelinha.modoDePreparo.model;

import com.panelinha.receita.model.Receita;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModoDePreparo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( nullable = false)
    private String titulo;

    @Column( nullable = false)
    private String descricao;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Receita receita;
}
