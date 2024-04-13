package com.inkhyang.pet.infrastructure.web.dto;

import java.time.LocalDate;

public record MarkDto(
        LocalDate date,
        String discipline,
        Integer score) {
}
