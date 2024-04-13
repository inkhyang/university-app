package com.inkhyang.pet.infrastructure.web.dto;

import java.util.List;

public record FacultDto(
        String name,
        List<GroupDto>groups) {
}
