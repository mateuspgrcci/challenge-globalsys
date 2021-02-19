package com.br.winechallenge.repository;

import com.br.winechallenge.entity.Cep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ICepRepository extends JpaRepository<Cep, UUID> {

    @Query("FROM Cep c WHERE ?1 BETWEEN c.startTrack AND c.endTrack")
    Cep getByCep(Long cep);
}
