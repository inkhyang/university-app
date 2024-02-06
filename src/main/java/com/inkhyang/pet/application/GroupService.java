package com.inkhyang.pet.application;

import com.inkhyang.pet.domain.classroom.Group;
import com.inkhyang.pet.infrastructure.persistence.GroupEntityRepository;
import com.inkhyang.pet.infrastructure.persistence.classroom.entity.GroupEntity;
import com.inkhyang.pet.infrastructure.persistence.classroom.mapper.GroupEntityMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupService {
    private final GroupEntityRepository groupEntityRepository;
    private final GroupEntityMapper groupMapper;

    public GroupService(GroupEntityRepository groupEntityRepository, GroupEntityMapper groupMapper) {
        this.groupEntityRepository = groupEntityRepository;
        this.groupMapper = groupMapper;
    }

    public Optional<Group> getByName(String name) {
        return groupEntityRepository.findByName(name)
                .map(groupMapper::toDomain);
    }

    public List<Group> getAll() {
        return groupEntityRepository.findAll().stream()
                .map(groupMapper::toDomain)
                .toList();
    }

    public Group create(Group group) {
        GroupEntity groupEntity = groupEntityRepository.save(groupMapper.toEntity(group));
        return groupMapper.toDomain(groupEntity);
    }

    public void remove(Group.GroupId id) {
        groupEntityRepository.findByName(id.name())
                .ifPresent(groupEntityRepository::delete);
    }
}
