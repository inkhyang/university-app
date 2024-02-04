package com.inkhyang.pet.infrastructure.persistance.classroom.mapper;

import com.inkhyang.pet.domain.classroom.Group;
import com.inkhyang.pet.infrastructure.persistance.classroom.entity.GroupEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper
public interface GroupEntityMapper {
    @Mapping(target = "id", source = ".", qualifiedByName = "toId")
    Group toDomain(GroupEntity groupEntity);

    @Mapping(target = "id", ignore = true)
    GroupEntity toEntity(Group group);

    @Named("toId")
    default Group.GroupId toId(GroupEntity groupEntity){
        return new Group.GroupId(groupEntity.getName());
    }
}
