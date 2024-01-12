package com.inkhyang.pet.repository;

import com.inkhyang.pet.domain.classroom.Facult;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class FacultRepository {
    private final Map<UUID, Facult> facults = new HashMap<>();
    private Facult findByID(UUID id){
        return facults.get(id);
    }
    private Facult save(Facult facult){
        return facults.put(facult.getId(), facult);
    }
    private void remove(Facult facult){
        facults.remove(facult.getId());
    }
}
