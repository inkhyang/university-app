package com.inkhyang.pet.infrastructure.web.classroom;


import com.inkhyang.pet.application.impl.FacultServiceImpl;
import com.inkhyang.pet.infrastructure.web.mapper.FacultDtoMapper;
import com.inkhyang.pet.domain.classroom.Facult;
import com.inkhyang.pet.infrastructure.web.classroom.dto.FacultDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facults")
public class FacultController {
    private final FacultServiceImpl service;
    private final FacultDtoMapper facultMapper;

    public FacultController(FacultServiceImpl service, FacultDtoMapper facultMapper) {
        this.service = service;
        this.facultMapper = facultMapper;
    }
    @GetMapping
    public List<FacultDto> all() {
        return service.getAll().stream()
                .map(facultMapper::toDto)
                .toList();
    }

    @PostMapping
    public FacultDto create(@RequestBody FacultDto newFacult) {
        Facult facult = service.create(facultMapper.toDomain(newFacult));
        return facultMapper.toDto(facult);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FacultDto> one(@PathVariable String name) {
        return ResponseEntity.of(service.getById(new Facult.FacultId(name))
                .map(facultMapper::toDto));
    }

    @DeleteMapping("/{id}")
    public void deleteFacult(@PathVariable String name) {
        service.remove(new Facult.FacultId(name));
    }
}
