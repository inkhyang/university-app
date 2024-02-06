package com.inkhyang.pet.infrastructure.persistence.student.mapper;


import com.inkhyang.pet.domain.student.Student;
import com.inkhyang.pet.infrastructure.persistence.student.entity.StudentEntity;
import org.mapstruct.*;

@Mapper(uses = {MarkEntityMapper.class})
public interface StudentEntityMapper {
    @Mapping(target = "id", source = ".", qualifiedByName = "toId")
    Student toDomain(StudentEntity studentEntity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "group", ignore = true)
    StudentEntity toEntity(Student student);

    @Named("toId")
    default Student.StudentId toId(StudentEntity studentEntity){
        return new Student.StudentId(studentEntity.getEmail());
    }

    @AfterMapping
    default void setStudentToMark(@MappingTarget StudentEntity studentEntity){
        studentEntity.getMarks().forEach(markEntity -> markEntity.setStudent(studentEntity));
    }
}
