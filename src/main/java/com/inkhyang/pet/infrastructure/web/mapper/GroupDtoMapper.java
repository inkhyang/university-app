package com.inkhyang.pet.infrastructure.web.mapper;

import com.inkhyang.pet.domain.classroom.Group;
import com.inkhyang.pet.infrastructure.web.classroom.dto.GroupDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(uses = {StudentDtoMapper.class})
public interface GroupDtoMapper {
    @Mapping(target = "id", source = ".", qualifiedByName = "toId")
    Group toDomain(GroupDto groupDto);

    GroupDto toDto(Group group);

    @Named("toId")
    default Group.GroupId toId(GroupDto groupDto){
        return new Group.GroupId(groupDto.name());
    }
}
