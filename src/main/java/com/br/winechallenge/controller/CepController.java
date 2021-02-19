package com.br.winechallenge.controller;

import com.br.winechallenge.dto.CepDTO;
import com.br.winechallenge.service.ICepService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/api")
@Api(value = "Challenge API REST")
@CrossOrigin(origins = "*")
public class CepController {

    @Autowired
    ICepService service;

    @GetMapping(path = "/cep/{cep}")
    @ApiOperation(value = "Get cep by cep")
    public ResponseEntity<CepDTO> getByCep(@PathVariable Long cep) {
        return new ResponseEntity<>(service.getByCep(cep), HttpStatus.OK);
    }

    @PostMapping(path = "/cep")
    @ApiOperation(value = "Register a new cep")
    public ResponseEntity<String> store(@RequestBody @Valid CepDTO dto) {
        service.store(dto);
        return new ResponseEntity<>("Cep successfully saved", HttpStatus.OK);
    }

    @PutMapping(path = "/cep")
    @ApiOperation(value = "Update a cep")

    public ResponseEntity<String> update(@RequestBody @Valid CepDTO dto) {
        service.update(dto);
        return new ResponseEntity<>("Cep changed successfully", HttpStatus.OK);
    }

    @DeleteMapping(path = "/cep")
    @ApiOperation(value = "Delete a cep")
    public ResponseEntity<String> delete(@RequestBody @Valid CepDTO dto) {
        service.delete(dto);
        return new ResponseEntity<>("Cep successfully deleted", HttpStatus.OK);
    }

}
