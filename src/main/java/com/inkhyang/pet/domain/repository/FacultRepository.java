package com.inkhyang.pet.domain.repository;

import com.inkhyang.pet.domain.classroom.Facult;

import java.util.List;

public interface FacultRepository {
    Facult findById(Facult.FacultId id);
    List<Facult> findAll();
    Facult save(Facult facult);
    void remove(Facult.FacultId id);
}
