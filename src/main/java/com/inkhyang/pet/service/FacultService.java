package com.inkhyang.pet.service;

import com.inkhyang.pet.domain.classroom.Facult;
import com.inkhyang.pet.repository.FacultRepository;

import java.util.List;
import java.util.UUID;

public class FacultService {
    private final FacultRepository facultRepository = new FacultRepository();

    public Facult getById(UUID id) {
        return facultRepository.findById(id);
    }
    public List<Facult> getAll(){
        return facultRepository.findAll();
    }
    public Facult add(Facult facult) {
        return facultRepository.save(facult);
    }
    public void remove(Facult facult){
        facultRepository.remove(facult);
    }
}
