package com.inkhyang.pet.infrastructure.web.mapper;

import com.inkhyang.pet.domain.Facult;
import com.inkhyang.pet.infrastructure.web.dto.FacultDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(uses = {GroupDtoMapper.class})
public interface FacultDtoMapper {
    @Mapping(target = "id", source = ".", qualifiedByName = "toId")
    Facult toDomain(FacultDto facultDto);

    FacultDto toDto(Facult facult);

    @Named("toId")
    default Facult.FacultId toId(FacultDto facultDto) {
        return new Facult.FacultId(facultDto.name());
    }
}
