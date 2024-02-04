package com.inkhyang.pet.application;

import com.inkhyang.pet.domain.classroom.Facult;
import com.inkhyang.pet.infrastructure.persistance.FacultEntityRepository;
import com.inkhyang.pet.infrastructure.persistance.classroom.entity.FacultEntity;
import com.inkhyang.pet.infrastructure.persistance.classroom.mapper.FacultEntityMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacultService {
    private final FacultEntityRepository facultEntityRepository;
    private final FacultEntityMapper facultMapper;

    public FacultService(FacultEntityRepository facultEntityRepository, FacultEntityMapper facultMapper) {
        this.facultEntityRepository = facultEntityRepository;
        this.facultMapper = facultMapper;
    }

    public Optional<Facult> getByName(String name) {
        return facultEntityRepository.findByName(name)
                .map(facultMapper::toDomain);
    }
    public List<Facult> getAll(){
        return facultEntityRepository.findAll().stream()
                .map(facultMapper::toDomain)
                .toList();
    }
    public Facult create(Facult facult) {
        FacultEntity facultEntity = facultEntityRepository.save(facultMapper.toEntity(facult));
        return facultMapper.toDomain(facultEntity);
    }
    public void remove(Facult.FacultId id){
        facultEntityRepository.findByName(id.name())
                .ifPresent(facultEntityRepository::delete);
    }
}
