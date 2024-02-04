package com.inkhyang.pet.infrastructure.web.classroom.dto;

import com.inkhyang.pet.infrastructure.web.student.dto.StudentDto;

import java.util.List;

public record GroupDto(
        String name,
        List<StudentDto>students) {
}
