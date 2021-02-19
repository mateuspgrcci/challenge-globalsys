package com.br.winechallenge.mapper;

import com.br.winechallenge.dto.CepDTO;
import com.br.winechallenge.entity.Cep;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICepMapper {

    CepDTO toDto(Cep cep);

    Cep toEntity(CepDTO cep);
}
