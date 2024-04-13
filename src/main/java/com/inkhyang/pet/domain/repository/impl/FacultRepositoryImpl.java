package com.inkhyang.pet.domain.repository.impl;

import com.inkhyang.pet.domain.repository.FacultRepository;
import com.inkhyang.pet.domain.Facult;
import com.inkhyang.pet.infrastructure.persistence.FacultEntityRepository;
import com.inkhyang.pet.infrastructure.persistence.entity.FacultEntity;
import com.inkhyang.pet.infrastructure.persistence.mapper.FacultEntityMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class FacultRepositoryImpl implements FacultRepository {
    private final FacultEntityRepository facultEntityRepository;
    private final FacultEntityMapper facultMapper;

    public FacultRepositoryImpl(FacultEntityRepository facultEntityRepository, FacultEntityMapper facultMapper) {
        this.facultEntityRepository = facultEntityRepository;
        this.facultMapper = facultMapper;
    }

    public Optional<Facult> findById(Facult.FacultId id) {
        return facultEntityRepository.findByName(id.name())
                .map(facultMapper::toDomain);
    }
    public List<Facult> findAll(){
        return facultEntityRepository.findAll().stream()
                .map(facultMapper::toDomain)
                .toList();
    }
    public Facult save(Facult facult) {
        FacultEntity facultEntity = facultEntityRepository.save(facultMapper.toEntity(facult));
        return facultMapper.toDomain(facultEntity);
    }
    public void remove(Facult.FacultId id){
        facultEntityRepository.findByName(id.name())
                .ifPresent(facultEntityRepository::delete);
    }
}
