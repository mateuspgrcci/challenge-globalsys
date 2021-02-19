package com.br.winechallenge.service.Impl;

import com.br.winechallenge.dto.CepDTO;
import com.br.winechallenge.entity.Cep;
import com.br.winechallenge.mapper.ICepMapper;
import com.br.winechallenge.repository.ICepRepository;
import com.br.winechallenge.service.ICepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CepService implements ICepService {

    @Autowired
    ICepMapper mapper;

    @Autowired
    ICepRepository repository;

    @Override
    public CepDTO getByCep(Long cep) {
        return mapper.toDto(repository.getByCep(cep));
    }

    @Override
    public void store(CepDTO dto) {
        if (isFree(dto))
            repository.save(mapper.toEntity(dto));
    }

    @Override
    public void update(CepDTO dto) {
        if (isFree(dto))
            repository.save(mapper.toEntity(dto));
    }

    @Override
    public void delete(CepDTO dto) {
        repository.delete(mapper.toEntity(dto));
    }

    public Boolean isFree(CepDTO dto) {
        List<Cep> list = repository.findAll();

        int checkStart = list.stream()
                .filter(cep -> !cep.getId().equals(dto.getId())
                        && dto.getStartTrack() >= cep.getStartTrack()
                        && dto.getStartTrack() < cep.getEndTrack())
                .collect(Collectors.toList()).size();

        int checkEnd = list.stream()
                .filter(cep -> !cep.getId().equals(dto.getId())
                        && dto.getEndTrack() >= cep.getStartTrack()
                        && dto.getEndTrack() < cep.getEndTrack())
                .collect(Collectors.toList()).size();

        return checkStart == 0 && checkEnd == 0;
    }

}
