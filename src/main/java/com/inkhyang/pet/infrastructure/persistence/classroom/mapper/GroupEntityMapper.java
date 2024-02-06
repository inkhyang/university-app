package com.inkhyang.pet.infrastructure.persistence.classroom.mapper;

import com.inkhyang.pet.domain.classroom.Group;
import com.inkhyang.pet.infrastructure.persistence.classroom.entity.GroupEntity;
import com.inkhyang.pet.infrastructure.persistence.student.mapper.StudentEntityMapper;
import org.mapstruct.*;

@Mapper(uses = {StudentEntityMapper.class})
public interface GroupEntityMapper {
    @Mapping(target = "id", source = ".", qualifiedByName = "toId")
    Group toDomain(GroupEntity groupEntity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "facult", ignore = true)
    GroupEntity toEntity(Group group);

    @Named("toId")
    default Group.GroupId toId(GroupEntity groupEntity){
        return new Group.GroupId(groupEntity.getName());
    }

    @AfterMapping
    default void setGroupToStudents(@MappingTarget GroupEntity groupEntity){
        groupEntity.getStudents().forEach(studentEntity -> studentEntity.setGroup(groupEntity));
    }
}
