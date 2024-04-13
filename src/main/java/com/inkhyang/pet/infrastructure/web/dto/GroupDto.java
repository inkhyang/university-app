package com.inkhyang.pet.infrastructure.web.dto;

import com.inkhyang.pet.infrastructure.web.dto.StudentDto;

import java.util.List;

public record GroupDto(
        String name,
        List<StudentDto>students) {
}
