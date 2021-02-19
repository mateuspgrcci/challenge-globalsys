package com.br.winechallenge.dto;


import org.springframework.lang.NonNull;

import java.io.Serializable;
import java.util.UUID;

public class CepDTO implements Serializable {

    private UUID id;

    @NonNull
    private String storeCode;

    @NonNull
    private Long startTrack;

    @NonNull
    private Long endTrack;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public Long getStartTrack() {
        return startTrack;
    }

    public void setStartTrack(Long startTrack) {
        this.startTrack = startTrack;
    }

    public Long getEndTrack() {
        return endTrack;
    }

    public void setEndTrack(Long endTrack) {
        this.endTrack = endTrack;
    }
}
