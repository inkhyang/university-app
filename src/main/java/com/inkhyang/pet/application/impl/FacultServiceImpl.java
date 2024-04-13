package com.inkhyang.pet.application.impl;

import com.inkhyang.pet.application.FacultService;
import com.inkhyang.pet.domain.Facult;
import com.inkhyang.pet.domain.repository.impl.FacultRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacultServiceImpl implements FacultService {
    private final FacultRepositoryImpl facultRepository;

    public FacultServiceImpl(FacultRepositoryImpl facultRepository) {
        this.facultRepository = facultRepository;
    }

    public Optional<Facult> getById(Facult.FacultId id) {
        return facultRepository.findById(id);
    }
    public List<Facult> getAll(){
        return facultRepository.findAll();
    }
    public Facult create(Facult facult) {
        return facultRepository.save(facult);
    }
    public void remove(Facult.FacultId id){
        facultRepository.remove(id);
    }
}
