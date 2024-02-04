package com.inkhyang.pet.infrastructure.web.student.dto;

import java.time.LocalDate;

public record MarkDto(
        LocalDate date,
        String discipline,
        Integer score) {
}
