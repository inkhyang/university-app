package com.inkhyang.pet.infrastructure.web.mapper;

import com.inkhyang.pet.domain.Mark;
import com.inkhyang.pet.infrastructure.web.dto.MarkDto;
import org.mapstruct.Mapper;

@Mapper
public interface MarkDtoMapper {
    Mark toDomain(MarkDto markDto);
    MarkDto toDto(Mark mark);
}
