package com.inkhyang.pet.infrastructure.persistence.mapper;

import com.inkhyang.pet.domain.Mark;
import com.inkhyang.pet.infrastructure.persistence.entity.MarkEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MarkEntityMapper {
    Mark toDomain(MarkEntity markEntity);

    MarkEntity toEntity(Mark mark);
}
