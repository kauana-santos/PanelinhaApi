package com.panelinha.modoDePreparo.repository;

import com.panelinha.modoDePreparo.model.ModoDePreparo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModoDePreparoRepository extends JpaRepository<ModoDePreparo, Long> {
}
