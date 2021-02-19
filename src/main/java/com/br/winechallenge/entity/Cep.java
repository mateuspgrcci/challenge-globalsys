package com.br.winechallenge.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;


@Entity
@Table(schema = "db", name = "CEP")
public class Cep implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(nullable = false, unique = true, updatable = false)
    private UUID id;

    @Column(nullable = false, name = "store_code")
    private String storeCode;

    @Column(nullable = false, name = "start_track")
    private Long startTrack;

    @Column(nullable = false, name = "end_track")
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
