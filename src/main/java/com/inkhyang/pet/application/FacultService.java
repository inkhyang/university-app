package com.inkhyang.pet.application;

import com.inkhyang.pet.domain.classroom.Facult;

import java.util.List;
import java.util.Optional;

public interface FacultService {
    Optional<Facult> getById(Facult.FacultId id);

    List<Facult> getAll();

    Facult create(Facult facult);

    void remove(Facult.FacultId id);
}
