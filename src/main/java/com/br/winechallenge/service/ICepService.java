package com.br.winechallenge.service;

import com.br.winechallenge.dto.CepDTO;

public interface ICepService {

    CepDTO getByCep(Long cep);

    void store(CepDTO dto);

    void update(CepDTO dto);

    void delete(CepDTO dto);
}
