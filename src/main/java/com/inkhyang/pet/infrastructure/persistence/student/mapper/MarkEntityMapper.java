package com.inkhyang.pet.infrastructure.persistence.student.mapper;

import com.inkhyang.pet.domain.student.Mark;
import com.inkhyang.pet.infrastructure.persistence.student.entity.MarkEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface MarkEntityMapper {
    Mark toDomain(MarkEntity markEntity);

    @Mapping(target = "id", ignore = true)
    MarkEntity toEntity(Mark mark);
}
