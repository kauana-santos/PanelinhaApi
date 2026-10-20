package com.panelinha.modoDePreparo.mapper;

import com.panelinha.modoDePreparo.dto.ModoDePreparoDto;
import com.panelinha.modoDePreparo.dto.ModoDePreparoResponseDto;
import com.panelinha.modoDePreparo.model.ModoDePreparo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-20T11:47:46-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.12.1 (Amazon.com Inc.)"
)
@Component
public class ModoDePreparoMapperImpl implements ModoDePreparoMapper {

    @Override
    public ModoDePreparo toEntity(ModoDePreparoDto dto) {
        if ( dto == null ) {
            return null;
        }

        ModoDePreparo modoDePreparo = new ModoDePreparo();

        modoDePreparo.setTitulo( dto.titulo() );
        modoDePreparo.setDescricao( dto.descricao() );

        return modoDePreparo;
    }

    @Override
    public ModoDePreparoResponseDto toResponseDto(ModoDePreparo modoDePreparo) {
        if ( modoDePreparo == null ) {
            return null;
        }

        Long id = null;
        String titulo = null;
        String descricao = null;

        id = modoDePreparo.getId();
        titulo = modoDePreparo.getTitulo();
        descricao = modoDePreparo.getDescricao();

        ModoDePreparoResponseDto modoDePreparoResponseDto = new ModoDePreparoResponseDto( id, titulo, descricao );

        return modoDePreparoResponseDto;
    }
}
