package com.inkhyang.pet.infrastructure.persistance.classroom.mapper;

import com.inkhyang.pet.domain.classroom.Facult;
import com.inkhyang.pet.infrastructure.persistance.classroom.entity.FacultEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper
public interface FacultEntityMapper {
    @Mapping(target = "id", source = ".", qualifiedByName = "toId")
    Facult toDomain(FacultEntity facultEntity);

    @Mapping(target = "id", ignore = true)
    FacultEntity toEntity(Facult facult);

    @Named("toId")
    default Facult.FacultId toId(FacultEntity facultEntity){
        return new Facult.FacultId(facultEntity.getName());
    }
}
