package com.inkhyang.pet.infrastructure.web.mapper;

import com.inkhyang.pet.domain.student.Student;
import com.inkhyang.pet.infrastructure.web.student.dto.StudentDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(uses = {MarkDtoMapper.class})
public interface StudentDtoMapper {

    @Mapping(target = "id", source = ".", qualifiedByName = "toId")
    Student toDomain(StudentDto studentDto);
    StudentDto toDto(Student student);
    @Named("toId")
    default Student.StudentId toId(StudentDto studentDto){
        return new Student.StudentId(studentDto.email());
    }
}
