package com.inkhyang.pet.repository;

import com.inkhyang.pet.domain.classroom.Facult;

import java.util.*;

public class FacultRepository {
    private final Map<UUID, Facult> facults = new HashMap<>();
    public Facult findById(UUID id){
        return facults.get(id);
    }
    public List<Facult> findAll(){
        return new ArrayList<>(facults.values());
    }
    public Facult save(Facult facult){
        return facults.put(facult.getId(), facult);
    }
    public void remove(Facult facult){
        facults.remove(facult.getId());
    }
}
