package com.inkhyang.pet.domain.repository.impl;

import com.inkhyang.pet.domain.classroom.Facult;
import com.inkhyang.pet.domain.repository.FacultRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FacultRepositoryImpl implements FacultRepository {
    private final Map<Facult.FacultId, Facult> facults = new HashMap<>();
    public Facult findById(Facult.FacultId id){
        return facults.get(id);
    }
    public List<Facult> findAll(){
        return new ArrayList<>(facults.values());
    }
    public Facult save(Facult facult){
        return facults.put(facult.getId(), facult);
    }
    public void remove(Facult.FacultId id){
        facults.remove(id);
    }
}
