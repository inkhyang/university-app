package com.inkhyang.pet.infrastructure.web.classroom.dto;

import java.util.List;

public record FacultDto(
        String name,
        List<GroupDto>groups) {
}
