package com.inkhyang.pet.infrastructure.persistence.classroom.mapper;

import com.inkhyang.pet.domain.classroom.Facult;
import com.inkhyang.pet.infrastructure.persistence.classroom.entity.FacultEntity;
import org.mapstruct.*;

@Mapper(uses = {GroupEntityMapper.class})
public interface FacultEntityMapper {
    @Mapping(target = "id", source = ".", qualifiedByName = "toId")
    Facult toDomain(FacultEntity facultEntity);

    @Mapping(target = "id", ignore = true)
    FacultEntity toEntity(Facult facult);

    @Named("toId")
    default Facult.FacultId toId(FacultEntity facultEntity){
        return new Facult.FacultId(facultEntity.getName());
    }

    @AfterMapping
    default void setFacultToGroup(@MappingTarget FacultEntity facultEntity){
        facultEntity.getGroups().forEach(groupEntity -> groupEntity.setFacult(facultEntity));
    }
}
