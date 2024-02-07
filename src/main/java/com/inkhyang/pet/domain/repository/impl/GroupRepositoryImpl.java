package com.inkhyang.pet.domain.repository.impl;

import com.inkhyang.pet.domain.classroom.Group;
import com.inkhyang.pet.domain.repository.GroupRepository;
import com.inkhyang.pet.infrastructure.persistence.GroupEntityRepository;
import com.inkhyang.pet.infrastructure.persistence.classroom.entity.GroupEntity;
import com.inkhyang.pet.infrastructure.persistence.classroom.mapper.GroupEntityMapper;

import java.util.List;
import java.util.Optional;

public class GroupRepositoryImpl implements GroupRepository {
    private final GroupEntityRepository groupEntityRepository;
    private final GroupEntityMapper groupMapper;

    public GroupRepositoryImpl(GroupEntityRepository groupEntityRepository, GroupEntityMapper groupMapper) {
        this.groupEntityRepository = groupEntityRepository;
        this.groupMapper = groupMapper;
    }

    public Optional<Group> findById(Group.GroupId id) {
        return groupEntityRepository.findByName(id.name())
                .map(groupMapper::toDomain);
    }

    public List<Group> findAll() {
        return groupEntityRepository.findAll().stream()
                .map(groupMapper::toDomain)
                .toList();
    }

    public Group save(Group group) {
        GroupEntity groupEntity = groupEntityRepository.save(groupMapper.toEntity(group));
        return groupMapper.toDomain(groupEntity);
    }

    public void remove(Group.GroupId id) {
        groupEntityRepository.findByName(id.name())
                .ifPresent(groupEntityRepository::delete);
    }
}
