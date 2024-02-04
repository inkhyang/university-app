package com.inkhyang.pet.infrastructure.web.student.dto;

import java.util.List;

public record StudentDto(
        String email,
        String firstName,
        String lastName,
        List<MarkDto> marks) {
}
