package com.inkhyang.pet.repository;

import com.inkhyang.pet.domain.classroom.Facult;

import java.util.*;

public class FacultRepository {
    private final Map<UUID, Facult> facults = new HashMap<>();
    private Facult findById(UUID id){
        return facults.get(id);
    }
    private List<Facult> findAll(){
        return new ArrayList<>(facults.values());
    }
    private Facult save(Facult facult){
        return facults.put(facult.getId(), facult);
    }
    private void remove(Facult facult){
        facults.remove(facult.getId());
    }
}
