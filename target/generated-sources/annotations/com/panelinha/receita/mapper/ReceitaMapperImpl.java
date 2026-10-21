package com.panelinha.receita.mapper;

import com.panelinha.ingrediente.dto.IngredienteResponseDto;
import com.panelinha.ingrediente.mapper.IngredienteMapper;
import com.panelinha.ingrediente.model.Ingrediente;
import com.panelinha.modoDePreparo.dto.ModoDePreparoResponseDto;
import com.panelinha.modoDePreparo.mapper.ModoDePreparoMapper;
import com.panelinha.modoDePreparo.model.ModoDePreparo;
import com.panelinha.receita.dto.ReceitaDto;
import com.panelinha.receita.dto.ReceitaResponseDto;
import com.panelinha.receita.model.Receita;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-21T11:25:34-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.12.1 (Amazon.com Inc.)"
)
@Component
public class ReceitaMapperImpl implements ReceitaMapper {

    @Autowired
    private IngredienteMapper ingredienteMapper;
    @Autowired
    private ModoDePreparoMapper modoDePreparoMapper;

    @Override
    public Receita toEntity(ReceitaDto dto) {
        if ( dto == null ) {
            return null;
        }

        Receita receita = new Receita();

        receita.setTitulo( dto.titulo() );
        receita.setDescricao( dto.descricao() );

        return receita;
    }

    @Override
    public ReceitaResponseDto toResponseDto(Receita receita) {
        if ( receita == null ) {
            return null;
        }

        Long id = null;
        String titulo = null;
        String descricao = null;
        List<IngredienteResponseDto> ingredientes = null;
        List<ModoDePreparoResponseDto> modoDePreparo = null;

        id = receita.getId();
        titulo = receita.getTitulo();
        descricao = receita.getDescricao();
        ingredientes = ingredienteListToIngredienteResponseDtoList( receita.getIngredientes() );
        modoDePreparo = modoDePreparoListToModoDePreparoResponseDtoList( receita.getModoDePreparo() );

        ReceitaResponseDto receitaResponseDto = new ReceitaResponseDto( id, titulo, descricao, ingredientes, modoDePreparo );

        return receitaResponseDto;
    }

    protected List<IngredienteResponseDto> ingredienteListToIngredienteResponseDtoList(List<Ingrediente> list) {
        if ( list == null ) {
            return null;
        }

        List<IngredienteResponseDto> list1 = new ArrayList<IngredienteResponseDto>( list.size() );
        for ( Ingrediente ingrediente : list ) {
            list1.add( ingredienteMapper.toResponseDto( ingrediente ) );
        }

        return list1;
    }

    protected List<ModoDePreparoResponseDto> modoDePreparoListToModoDePreparoResponseDtoList(List<ModoDePreparo> list) {
        if ( list == null ) {
            return null;
        }

        List<ModoDePreparoResponseDto> list1 = new ArrayList<ModoDePreparoResponseDto>( list.size() );
        for ( ModoDePreparo modoDePreparo : list ) {
            list1.add( modoDePreparoMapper.toResponseDto( modoDePreparo ) );
        }

        return list1;
    }
}
