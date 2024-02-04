package com.inkhyang.pet.infrastructure.web.classroom;

import com.inkhyang.pet.application.GroupService;
import com.inkhyang.pet.infrastructure.web.mapper.GroupDtoMapper;
import com.inkhyang.pet.domain.classroom.Group;
import com.inkhyang.pet.infrastructure.web.classroom.dto.GroupDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/groups")
public class GroupController {
    private final GroupService service;
    private final GroupDtoMapper groupMapper;

    public GroupController(GroupService service, GroupDtoMapper groupMapper) {
        this.service = service;
        this.groupMapper = groupMapper;
    }


    @GetMapping
    public List<GroupDto> all() {
        return service.getAll().stream()
                .map(groupMapper::toDto)
                .toList();
    }

    @PostMapping
    public GroupDto create(@RequestBody GroupDto newGroup) {
        Group group = service.create(groupMapper.toDomain(newGroup));
        return groupMapper.toDto(group);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GroupDto> one(@PathVariable String name) {
        return ResponseEntity.of(service.getByName(name)
                .map(groupMapper::toDto));
    }

    @DeleteMapping("/{id}")
    public void deleteGroup(@PathVariable String name) {
        service.remove(new Group.GroupId(name));
    }
}
